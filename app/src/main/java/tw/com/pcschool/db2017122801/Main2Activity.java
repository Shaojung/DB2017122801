package tw.com.pcschool.db2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void clickOkay(View v)
    {
        Intent it = new Intent();
        it.putExtra("myresult", "ABC123");
        setResult(RESULT_OK , it);
        finish();
    }
    public void clickCancel(View v)
    {
        finish();
    }
}
