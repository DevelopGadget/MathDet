package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pasos4x4 extends AppCompatActivity implements View.OnClickListener{

    TextView X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27,X28,X29,Resul,Suma;
    Bundle A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos4x4);
        Intancias();
        Asignacion();
    }
    private void Intancias(){
        X14 = (TextView) findViewById(R.id.X14);
        X15 = (TextView) findViewById(R.id.X15);
        X16 = (TextView) findViewById(R.id.X16);
        X17 = (TextView) findViewById(R.id.X17);
        X18 = (TextView) findViewById(R.id.X18);
        X19 = (TextView) findViewById(R.id.X19);
        X20 = (TextView) findViewById(R.id.X20);
        X21 = (TextView) findViewById(R.id.X21);
        X22 = (TextView) findViewById(R.id.X22);
        X23 = (TextView) findViewById(R.id.X23);
        X24 = (TextView) findViewById(R.id.X24);
        X25 = (TextView) findViewById(R.id.X25);
        X26 = (TextView) findViewById(R.id.X26);
        X27 = (TextView) findViewById(R.id.X27);
        X28 = (TextView) findViewById(R.id.X28);
        X29 = (TextView) findViewById(R.id.X29);
        Resul = (TextView) findViewById(R.id.Resul);
        Suma = (TextView) findViewById(R.id.Suma);
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);
    }
    private  void Asignacion(){
        A = getIntent().getExtras();
        X14.setText(""+A.getDouble("x14"));
        X15.setText(""+A.getDouble("x15"));
        X16.setText(""+A.getDouble("x16"));
        X17.setText(""+A.getDouble("x17"));
        X18.setText(""+A.getDouble("x18"));
        X19.setText(""+A.getDouble("x19"));
        X20.setText(""+A.getDouble("x20"));
        X21.setText(""+A.getDouble("x21"));
        X22.setText(""+A.getDouble("x22"));
        X23.setText(""+A.getDouble("x23"));
        X24.setText(""+A.getDouble("x24"));
        X25.setText(""+A.getDouble("x25"));
        X26.setText(""+A.getDouble("x26"));
        X27.setText(""+A.getDouble("x27"));
        X28.setText(""+A.getDouble("x28"));
        X29.setText(""+A.getDouble("x29"));
        Resul.setText("= "+A.getDouble("Resul"));
        Suma.setText("= ("+A.getDouble("Det1") + " )" + " + " + "( " + A.getDouble("Det2") + ")" + " + " + "( " + A.getDouble("Det3") + " )" + " + " + "( " + A.getDouble("Det4") + " )");
    }

    @Override
    public void onClick(View view) {
        A = getIntent().getExtras();
        Intent i;
        switch(view.getId()){
            case R.id.Paso1:
                i = new Intent(getApplicationContext(), Paso1_4x4.class);
                i.putExtra("var",A);
                startActivity(i);
                break;
            case R.id.Paso2:
                i = new Intent(getApplicationContext(), Paso2_4x4.class);
                i.putExtra("var",A);
                startActivity(i);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
