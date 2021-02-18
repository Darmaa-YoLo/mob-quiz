package darambazar.example.com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.List;

public class AsuultHeseg extends AppCompatActivity {
    MaterialTextView textView;
    ProgressBar progressBar;
    Button hariult1,hariult2,hariult3,hariult4;

    //asuultiig solihod ashiglagdana
    int tooluur=0;

    //progressbar-n utgiig nemegduuleh
    int progress_tooluur=0;

    //zov hariutliig hadgalah huvisagch
    String zovHariult;

    //Onoog tooloh huvisagch
    int onoo=0;

    //neg udaagiin asuultiig hadgalah huvisagch
    List<String[]> asuultuud=new ArrayList<String[]>();

    DBHelper dbHelper=new DBHelper(AsuultHeseg.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asuult_heseg);
        Bundle b=getIntent().getExtras();
        String string=b.getString("sedev");
        asuultuud=dbHelper.read(string);

        textView=(MaterialTextView)findViewById(R.id.asuult);

        progressBar=(ProgressBar)findViewById(R.id.my_progressBar) ;
        //progressBar.setProgress(progress_tooluur);

        hariult1=(Button)findViewById(R.id.hariult1);

        hariult2=(Button)findViewById(R.id.hariult2);

        hariult3=(Button)findViewById(R.id.hariult3);

        hariult4=(Button)findViewById(R.id.hariult4);

        asuultBaiguulagch(asuultuud);
        tooluur++;
        hariult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressGuilgegch(progress_tooluur);
                hariultTohiruulagch(hariult1.getText().toString());

                checker();

            }
        });

        hariult2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressGuilgegch(progress_tooluur);
                hariultTohiruulagch(hariult2.getText().toString());
                checker();

            }
        });

        hariult3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressGuilgegch(progress_tooluur);
                hariultTohiruulagch(hariult3.getText().toString());
                checker();


            }
        });

        hariult4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressGuilgegch(progress_tooluur);
                hariultTohiruulagch(hariult4.getText().toString());
                checker();


            }
        });


    }
    public void checker()
    {
        Log.e("tooluur",Integer.toString(tooluur));
        if(tooluur==10)
        {
            Intent intent=new Intent(AsuultHeseg.this,Togsgol.class);
            Bundle b=new Bundle();
            b.putString("onoo",Integer.toString(onoo));
            intent.putExtras(b);
            startActivity(intent);
        }
        else
        {
            asuultBaiguulagch(asuultuud);
            tooluur++;
        }


    }
    public void hariultTohiruulagch(String str)
    {

        //tovch darahd tuhain tovchnii text avch db ees irsen zov hariulttai tulgaj zov esehiig shiidej baina
        if(str.equals(zovHariult))
        {
            onoo++;
            ZovDialog zov=new ZovDialog();
            zov.showDialog(AsuultHeseg.this,"Хариулт зөв байна");
        }
        else
        {
            BuruuDialog buruu=new BuruuDialog();
            buruu.showDialog(AsuultHeseg.this,"Хариулт буруу байна");
        }
    }
    public void asuultBaiguulagch(List<String[]> rows)
    {
        //asuultuudaas darallaar asuult 1 1eer awna
        String[] as=new String[8];

        as=rows.get(tooluur);

        //asuultiig avch baina
        textView.setText("Aсуулт "+(tooluur+1)+") "+as[1]);
        //hariult 1 avch baina
        hariult1.setText(as[2]);
        //hariult 2 avch baina
        hariult2.setText(as[3]);
        //hariult 3 avch baina
        hariult3.setText(as[4]);
        //hariult 4 avch baina
        hariult4.setText(as[5]);
        //zov hariultiig avch baina
        zovHariult=as[7];

    }
    public void progressGuilgegch(int pt)
    {
        progress_tooluur+=10;
        progressBar.setProgress(progress_tooluur);
    }
}
