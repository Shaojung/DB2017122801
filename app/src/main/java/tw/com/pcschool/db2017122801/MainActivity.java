package tw.com.pcschool.db2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        tv = findViewById(R.id.textView);
        tv.setText("123");
    }
    public void click2(View v)
    {
        EditText ed = findViewById(R.id.editText);
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        it.putExtra("data", ed.getText().toString());
        startActivity(it);
    }
}
