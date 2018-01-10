package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        findViewById(R.id.btnAdjunta).setOnClickListener(this);
        findViewById(R.id.btnDeterminante).setOnClickListener(this);
        findViewById(R.id.btnInversa).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()){
            case R.id.btnDeterminante:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opción","1");
                break;
            case R.id.btnAdjunta:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opción","2");
                break;
            case R.id.btnInversa:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opción","3");
                break;
        }
        startActivity(i);
    }
}
