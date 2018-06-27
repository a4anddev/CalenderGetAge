package getage.getage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    EditText tedit;
    TextView ttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tedit = findViewById(R.id.tedit);
        ttext = findViewById(R.id.tview);
    }

    public void GetAge(View view) {

        int dob = Integer.parseInt(tedit.getText().toString());
        Calendar calendar = Calendar.getInstance();
        // get curent year
//        int year = calendar.get(Calendar.YEAR;

        // get current month
//        int year = calendar.get(Calendar.MONTH);

        // get current date
        int year = calendar.get(Calendar.DATE);

        int age = year - dob;

        Log.i(TAG, "year " + year);
        Log.i(TAG, "Age" + age);
        Log.i(TAG, "month" + age * 12);

        Log.i(TAG, "days" + age * 365);

    }
}
