package mathdet.mathgadget.com.mathdet.Determinante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import mathdet.mathgadget.com.mathdet.R;

public class Pasos3x3 extends AppCompatActivity implements View.OnClickListener{

    TextView X5,X6,X7,X8,X9,X10,X11,X12,X13,Resul,Determinante;
    Bundle var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos3x3);
        Intancias();
        var = getIntent().getExtras();
        X5.setText(String.valueOf(var.getDouble("x5")));
        X6.setText(String.valueOf(var.getDouble("x6")));
        X7.setText(String.valueOf(var.getDouble("x7")));
        X8.setText(String.valueOf(var.getDouble("x8")));
        X9.setText(String.valueOf(var.getDouble("x9")));
        X10.setText(String.valueOf(var.getDouble("x10")));
        X11.setText(String.valueOf(var.getDouble("x11")));
        X12.setText(String.valueOf(var.getDouble("x12")));
        X13.setText(String.valueOf(var.getDouble("x13")));
        Resul.setText("( " + String.valueOf(var.getDouble("Part1")) + " )" + " - " + "( " + String.valueOf(var.getDouble("Part2")) + " )");
        Determinante.setText("= "+ var.getDouble("Determinante"));
    }
    private void  Intancias(){

        X5 = (TextView) findViewById(R.id.X5);
        X6 = (TextView) findViewById(R.id.X6);
        X7 = (TextView) findViewById(R.id.X7);
        X8 = (TextView) findViewById(R.id.X8);
        X9 = (TextView) findViewById(R.id.X9);
        X10 = (TextView) findViewById(R.id.X10);
        X11 = (TextView) findViewById(R.id.X11);
        X12 = (TextView) findViewById(R.id.X12);
        X13 = (TextView) findViewById(R.id.X13);
        Resul = (TextView) findViewById(R.id.Resul);
        Determinante = (TextView) findViewById(R.id.Determinante);
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View view) {
        var = getIntent().getExtras();
        Intent inte;
        switch (view.getId()){
            case R.id.Paso1:
                inte = new Intent(getApplicationContext(), Paso1_3x3.class);
                inte.putExtra("var",var);
                startActivity(inte);
                break;
            case R.id.Paso2:
                inte = new Intent(getApplicationContext(), Paso2_3x3.class);
                inte.putExtra("var",var);
                startActivity(inte);
                break;
        }
    }
}
