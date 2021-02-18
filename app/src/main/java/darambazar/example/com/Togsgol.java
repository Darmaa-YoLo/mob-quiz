package darambazar.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Togsgol extends AppCompatActivity {
    MaterialTextView zurag,text;
    MaterialButton dahin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.togsgol_heseg);
        zurag=(MaterialTextView)findViewById(R.id.togsgol_zurag);
        text=(MaterialTextView)findViewById(R.id.cong);
        dahin=(MaterialButton)findViewById(R.id.back);

        Bundle b=getIntent().getExtras();
        String onoo=b.getString("onoo");
        zurag.setText(onoo+"/10");
        if(Integer.parseInt(onoo)<6)
        {
            text.setText("Харамсалтай байна");
        }
        dahin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dahin=new Intent(Togsgol.this,SedevSongolt.class);
                startActivity(dahin);
            }
        });
    }
}
