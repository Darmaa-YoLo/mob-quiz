package darambazar.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.ehleh);
        about=(Button)findViewById(R.id.about);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sedevsongolt=new Intent(MainActivity.this,SedevSongolt.class);
                startActivity(sedevsongolt);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog buruu=new AboutDialog();
                buruu.showDialog(MainActivity.this,"Дарамбазар &; Оргилсайхан \n хамтын бүтээл \n 2020он");
            }
        });
    }

}
