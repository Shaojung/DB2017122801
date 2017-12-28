package tw.com.pcschool.db2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void clickOkay(View v)
    {
        EditText ed2;
        ed2 = findViewById(R.id.editText2);
        Intent it = new Intent();
        it.putExtra("myresult",ed2.getText().toString());
        setResult(RESULT_OK , it);
        finish();
    }
    public void clickCancel(View v)
    {
        finish();
    }
}
