package study.vv.comstudy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Switchable(View view) {
        //Intent intent=new Intent(this,Main2Activity.class);
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.com"));
        EditText t=(EditText)findViewById(R.id.tt);
        intent.putExtra("mytext",t.getText().toString());
        startActivity(intent);
    }
}
