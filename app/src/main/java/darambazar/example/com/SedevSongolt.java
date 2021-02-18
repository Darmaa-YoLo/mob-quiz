package darambazar.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class SedevSongolt extends AppCompatActivity {
    MaterialButton sedev1,sedev2,sedev3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sedev_songolt);
        sedev1=(MaterialButton) findViewById(R.id.sedev1);
        sedev2=(MaterialButton) findViewById(R.id.sedev2);
        sedev3=(MaterialButton) findViewById(R.id.sedev3);

        sedev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SedevSongolt.this,AsuultHeseg.class);
                Bundle b=new Bundle();
                b.putString("sedev","хөл бөмбөг");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        sedev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SedevSongolt.this,AsuultHeseg.class);
                Bundle b=new Bundle();
                b.putString("sedev","сагсан бөмбөг");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        sedev3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SedevSongolt.this,AsuultHeseg.class);
                Bundle b=new Bundle();
                b.putString("sedev","танин мэдэхүй");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
