package tw.com.pcschool.db2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv, tv3;
    final int REQUEST_PAGE_2 = 123;
    final int REQUEST_PAGE_3 = 456;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        tv3 = findViewById(R.id.textView3);
    }
    public void click1(View v)
    {
        tv.setText("123");
    }
    public void click2(View v)
    {
        EditText ed = findViewById(R.id.editText);
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        it.putExtra("data", ed.getText().toString());
        startActivity(it);
    }
    public void click3(View v)
    {
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivityForResult(it, REQUEST_PAGE_2);
    }

    public void click4(View v)
    {
        Intent it = new Intent(MainActivity.this, Main3Activity.class);
        startActivityForResult(it, REQUEST_PAGE_3);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PAGE_2)
        {
            if (resultCode == RESULT_OK)
            {
                tv.setText(data.getStringExtra("myresult"));
            }
        }
        if (requestCode == REQUEST_PAGE_3)
        {
            if (resultCode == RESULT_OK)
            {
                tv3.setText(data.getStringExtra("myresult"));
            }
        }

    }
}
