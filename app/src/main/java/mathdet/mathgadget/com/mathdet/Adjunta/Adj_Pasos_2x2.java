package mathdet.mathgadget.com.mathdet.Adjunta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import mathdet.mathgadget.com.mathdet.R;

public class Adj_Pasos_2x2 extends AppCompatActivity {

    private TextView X1, X2, X3, X4, X1_1, X2_1, X3_1, X4_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj__pasos_2x2);
        Texto();
    }

    private void Texto() {
        Bundle i = getIntent().getExtras();
        X1 = findViewById(R.id.X1);
        X2 = findViewById(R.id.X2);
        X3 = findViewById(R.id.X3);
        X4 = findViewById(R.id.X4);
        X1_1 = findViewById(R.id.X1_1);
        X2_1 = findViewById(R.id.X2_1);
        X3_1 = findViewById(R.id.X3_1);
        X4_1 = findViewById(R.id.X4_1);
        X1.setText("" + i.get("X1"));
        X2.setText("" + i.get("X2"));
        X3.setText("" + i.get("X3"));
        X4.setText("" + i.get("X4"));
        X1_1.setText("" + i.get("X4"));
        X2_1.setText("" + (-1 * i.getDouble("X3")));
        X3_1.setText("" + (-1 *i.getDouble("X2")));
        X4_1.setText("" + i.get("X1"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
