package mathdet.mathgadget.com.mathdet.Determinante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import mathdet.mathgadget.com.mathdet.R;

public class Pasos2X2 extends AppCompatActivity {
    TextView X1,X2,X3,X4,Diagonal1,Diagonal2,Resul,fin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos2_x2);
        X1 = (TextView) findViewById(R.id.X1);
        X2 = (TextView) findViewById(R.id.X2);
        X3 = (TextView) findViewById(R.id.X3);
        X4 = (TextView) findViewById(R.id.X4);
        Diagonal1 = (TextView) findViewById(R.id.Diagonal1);
        Diagonal2 = (TextView) findViewById(R.id.Diagonal2);
        fin = (TextView) findViewById(R.id.textView18);
        Resul = (TextView) findViewById(R.id.textView16);
        Bundle bundle = getIntent().getExtras();
        Diagonal1.setText(String.valueOf(bundle.getDouble("X1"))+" * "+String.valueOf(bundle.getDouble("X4")) + " = " + (bundle.getDouble("X1") * bundle.getDouble("X4")));
        Diagonal2.setText(String.valueOf(bundle.getDouble("X3"))+" * "+String.valueOf(bundle.getDouble("X2")) + " = " + (bundle.getDouble("X3") * bundle.getDouble("X2")));
        Resul.setText("( "+ (bundle.getDouble("X1") * bundle.getDouble("X4")) + " )" + " - " + "(" + (bundle.getDouble("X3") * bundle.getDouble("X2")) + " )");
        fin.setText("= "+ ((bundle.getDouble("X1") * bundle.getDouble("X4")) - (bundle.getDouble("X3") * bundle.getDouble("X2"))));
        X1.setText(String.valueOf(bundle.getDouble("X1")));
        X2.setText(String.valueOf(bundle.getDouble("X2")));
        X3.setText(String.valueOf(bundle.getDouble("X3")));
        X4.setText(String.valueOf(bundle.getDouble("X4")));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
