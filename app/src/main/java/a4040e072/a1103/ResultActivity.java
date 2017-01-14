package a4040e072.a1103;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult = (TextView) findViewById(R.id.tvResult);
        showResults();
    }

    private void showResults() {
        NumberFormat nf = NumberFormat.getInstance();
        Bundle bundle = getIntent().getExtras();
        int programming = bundle.getInt("programming");
        int dataStructure = bundle.getInt("dataStructure");
        int algorithm = bundle.getInt("algorithm");
        int B = bundle.getInt("B");
        int sum = programming + dataStructure + algorithm + B;
        double average = sum / 4.0;
        String text =  "國文 = " + programming +
                "\n自然 = " + dataStructure +
                "\n社會 = " + algorithm +
                "\n數學 = " + B +
                "\n和 = " + sum +
                "\n平均值 = " + nf.format(average);
        tvResult.setText(text);
    }

    public void onBackClick(View view) {
        finish();
    }
}

