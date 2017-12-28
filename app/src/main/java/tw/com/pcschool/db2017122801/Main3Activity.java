package tw.com.pcschool.db2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void click3(View v)
    {
        Intent it = new Intent();
        it.putExtra("myresult", "DEF456");
        setResult(RESULT_OK , it);
        finish();
    }
}
