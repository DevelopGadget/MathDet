package mathdet.mathgadget.com.mathdet.Determinante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mathdet.mathgadget.com.mathdet.R;

public class Paso1_3x3 extends AppCompatActivity {

    TextView X5,X6,X7,X8,X9,X10,X11,X12,X13,X5_2,X6_2,X7_2,X8_2,X9_2,X10_2,X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso1_3x3);
        Intancias();
        Bundle vari = getIntent().getExtras();
        X5.setText(String.valueOf(vari.getBundle("var").getDouble("x5")));
        X5_2.setText(String.valueOf(vari.getBundle("var").getDouble("x5")));
        X5_1.setText(String.valueOf(vari.getBundle("var").getDouble("x5")));
        X6.setText(String.valueOf(vari.getBundle("var").getDouble("x6")));
        X6_2.setText(String.valueOf(vari.getBundle("var").getDouble("x6")));
        X6_1.setText(String.valueOf(vari.getBundle("var").getDouble("x6")));
        X7.setText(String.valueOf(vari.getBundle("var").getDouble("x7")));
        X7_2.setText(String.valueOf(vari.getBundle("var").getDouble("x7")));
        X7_1.setText(String.valueOf(vari.getBundle("var").getDouble("x7")));
        X8.setText(String.valueOf(vari.getBundle("var").getDouble("x8")));
        X8_2.setText(String.valueOf(vari.getBundle("var").getDouble("x8")));
        X8_1.setText(String.valueOf(vari.getBundle("var").getDouble("x8")));
        X9.setText(String.valueOf(vari.getBundle("var").getDouble("x9")));
        X9_2.setText(String.valueOf(vari.getBundle("var").getDouble("x9")));
        X9_1.setText(String.valueOf(vari.getBundle("var").getDouble("x9")));
        X10.setText(String.valueOf(vari.getBundle("var").getDouble("x10")));
        X10_2.setText(String.valueOf(vari.getBundle("var").getDouble("x10")));
        X10_1.setText(String.valueOf(vari.getBundle("var").getDouble("x10")));
        X11.setText(String.valueOf(vari.getBundle("var").getDouble("x11")));
        X11_1.setText(String.valueOf(vari.getBundle("var").getDouble("x11")));
        X12.setText(String.valueOf(vari.getBundle("var").getDouble("x12")));
        X12_1.setText(String.valueOf(vari.getBundle("var").getDouble("x12")));
        X13.setText(String.valueOf(vari.getBundle("var").getDouble("x13")));
        X13_1.setText(String.valueOf(vari.getBundle("var").getDouble("x13")));
    }
    private void  Intancias(){

        X5 = (TextView) findViewById(R.id.X5);
        X6 = (TextView) findViewById(R.id.X6);
        X7 = (TextView) findViewById(R.id.X7);
        X8 = (TextView) findViewById(R.id.X8);
        X9 = (TextView) findViewById(R.id.X9);
        X10 = (TextView) findViewById(R.id.X10);
        X11 = (TextView) findViewById(R.id.X11);
        X11_1 = (TextView) findViewById(R.id.X11_1);
        X12 = (TextView) findViewById(R.id.X12);
        X12_1 = (TextView) findViewById(R.id.X12_1);
        X13 = (TextView) findViewById(R.id.X13);
        X13_1 = (TextView) findViewById(R.id.X13_1);
        X5_2 = (TextView) findViewById(R.id.X5_2);
        X5_1 = (TextView) findViewById(R.id.X5_1);
        X6_2 = (TextView) findViewById(R.id.X6_2);
        X6_1 = (TextView) findViewById(R.id.X6_1);
        X7_2 = (TextView) findViewById(R.id.X7_2);
        X7_1 = (TextView) findViewById(R.id.X7_1);
        X8_2 = (TextView) findViewById(R.id.X8_2);
        X8_1 = (TextView) findViewById(R.id.X8_1);
        X9_2 = (TextView) findViewById(R.id.X9_2);
        X9_1 = (TextView) findViewById(R.id.X9_1);
        X10_2 = (TextView) findViewById(R.id.X10_2);
        X10_1 = (TextView) findViewById(R.id.X10_1);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
