package study.vv.comstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=this.getIntent();
        String text= intent.getStringExtra("mytext");
        //String text= getIntent().getStringExtra("mytext");
        TextView txt=(TextView)findViewById(R.id.text23);
        txt.setText(text);
    }
}
