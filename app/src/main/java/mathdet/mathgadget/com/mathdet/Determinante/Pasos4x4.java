package mathdet.mathgadget.com.mathdet.Determinante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import mathdet.mathgadget.com.mathdet.R;

public class Pasos4x4 extends AppCompatActivity implements View.OnClickListener{

    private TextView X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27,X28,X29,Resul,Suma;
    private Bundle A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos4x4);
        A = getIntent().getExtras();
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
        Resul.setText("= "+(Det1() + Det2() + Det3() + Det4()));
        Suma.setText("= ("+Det1() + " )" + " + " + "( " + Det2() + ")" + " + " + "( " + Det3() + " )" + " + " + "( " + Det4() + " )");
    }

    private double Det1(){
        return A.getDouble("x14") * (Math.pow(-1, 2) * ((A.getDouble("x19") * A.getDouble("x24") * A.getDouble("x29") +
                A.getDouble("x23") * A.getDouble("x28") * A.getDouble("x21") +
                A.getDouble("x27") * A.getDouble("x20") * A.getDouble("x25")) -
                (A.getDouble("x21") * A.getDouble("x24") * A.getDouble("x27") +
                 A.getDouble("x25") * A.getDouble("x28") * A.getDouble("x19") +
                 A.getDouble("x29") * A.getDouble("x20") * A.getDouble("x23"))));
    }

    private double Det2(){
        return A.getDouble("x15") * (Math.pow(-1, 3) * ((A.getDouble("x18") * A.getDouble("x24") * A.getDouble("x29") +
                A.getDouble("x22") * A.getDouble("x28") * A.getDouble("x21") +
                A.getDouble("x26") * A.getDouble("x20") * A.getDouble("x25")) -
                (A.getDouble("x21") * A.getDouble("x24") * A.getDouble("x26") +
                 A.getDouble("x25") * A.getDouble("x28") * A.getDouble("x18") +
                 A.getDouble("x29") * A.getDouble("x20") * A.getDouble("x22"))));
    }

    private double Det3(){
        return A.getDouble("x16") * (Math.pow(-1, 4) * ((A.getDouble("x18") * A.getDouble("x23") * A.getDouble("x29") +
                A.getDouble("x22") * A.getDouble("x27") * A.getDouble("x21") +
                A.getDouble("x26") * A.getDouble("x19") * A.getDouble("x25")) -
                (A.getDouble("x21") * A.getDouble("x23") * A.getDouble("x26") +
                 A.getDouble("x25") * A.getDouble("x27") * A.getDouble("x18") +
                 A.getDouble("x29") * A.getDouble("x19") * A.getDouble("x22"))));
    }

    private double Det4(){
        return A.getDouble("x17") * (Math.pow(-1, 5) * ((A.getDouble("x18") * A.getDouble("x23") * A.getDouble("x28") +
                A.getDouble("x22") * A.getDouble("x27") * A.getDouble("x20") +
                A.getDouble("x26") * A.getDouble("x19") * A.getDouble("x24")) -
                (A.getDouble("x20") * A.getDouble("x23") * A.getDouble("x26") +
                 A.getDouble("x24") * A.getDouble("x27") * A.getDouble("x18") +
                 A.getDouble("x28") * A.getDouble("x19") * A.getDouble("x22"))));
    }

    private double parte1Det1(){
        return (A.getDouble("x19") * A.getDouble("x24") * A.getDouble("x29") +
                A.getDouble("x23") * A.getDouble("x28") * A.getDouble("x21") +
                A.getDouble("x27") * A.getDouble("x20") * A.getDouble("x25"));
    }

    private double parte2Det1(){
        return (A.getDouble("x21") * A.getDouble("x24") * A.getDouble("x27") +
                A.getDouble("x25") * A.getDouble("x28") * A.getDouble("x19") +
                A.getDouble("x29") * A.getDouble("x20") * A.getDouble("x23"));
    }

    private double parte1Det2(){
        return (A.getDouble("x18") * A.getDouble("x24") * A.getDouble("x29") +
                A.getDouble("x22") * A.getDouble("x28") * A.getDouble("x21") +
                A.getDouble("x26") * A.getDouble("x20") * A.getDouble("x25"));
    }

    private double parte2Det2(){
        return (A.getDouble("x21") * A.getDouble("x24") * A.getDouble("x26") +
                A.getDouble("x25") * A.getDouble("x28") * A.getDouble("x18") +
                A.getDouble("x29") * A.getDouble("x20") * A.getDouble("x22"));
    }

    private double parte1Det3(){
        return (A.getDouble("x18") * A.getDouble("x23") * A.getDouble("x29") +
                A.getDouble("x22") * A.getDouble("x27") * A.getDouble("x21") +
                A.getDouble("x26") * A.getDouble("x19") * A.getDouble("x25"));
    }

    private double parte2Det3(){
        return (A.getDouble("x21") * A.getDouble("x23") * A.getDouble("x26") +
                A.getDouble("x25") * A.getDouble("x27") * A.getDouble("x18") +
                A.getDouble("x29") * A.getDouble("x19") * A.getDouble("x22"));
    }

    private double parte1Det4(){
        return (A.getDouble("x18") * A.getDouble("x23") * A.getDouble("x28") +
                A.getDouble("x22") * A.getDouble("x27") * A.getDouble("x20") +
                A.getDouble("x26") * A.getDouble("x19") * A.getDouble("x24"));
    }

    private double parte2Det4(){
        return (A.getDouble("x20") * A.getDouble("x23") * A.getDouble("x26") +
                A.getDouble("x24") * A.getDouble("x27") * A.getDouble("x18") +
                A.getDouble("x28") * A.getDouble("x19") * A.getDouble("x22"));
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
                i.putExtra("Det1", Det1());
                i.putExtra("Det2", Det2());
                i.putExtra("Det3", Det3());
                i.putExtra("Det4", Det4());
                i.putExtra("Parte1Det1", parte1Det1());
                i.putExtra("Parte2Det1", parte2Det1());
                i.putExtra("Parte1Det2", parte1Det2());
                i.putExtra("Parte2Det2", parte2Det2());
                i.putExtra("Parte1Det3", parte1Det3());
                i.putExtra("Parte2Det3", parte2Det3());
                i.putExtra("Parte1Det4", parte1Det4());
                i.putExtra("Parte2Det4", parte2Det4());
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
