package mathdet.mathgadget.com.mathdet.Adjunta;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mathdet.mathgadget.com.mathdet.Determinante.Pasos3x3;
import mathdet.mathgadget.com.mathdet.R;

public class tres extends AppCompatActivity implements View.OnClickListener{

    EditText X5,X6,X7,X8,X9,X10,X11,X12,X13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        Botones();
        X5.requestFocus();
    }
    private void Botones(){
        X5 = (EditText) findViewById(R.id.X5);
        X6 = (EditText) findViewById(R.id.X6);
        X7 = (EditText) findViewById(R.id.X7);
        X8 = (EditText) findViewById(R.id.X8);
        X9 = (EditText) findViewById(R.id.X9);
        X10 = (EditText) findViewById(R.id.X10);
        X11 = (EditText) findViewById(R.id.X11);
        X12 = (EditText) findViewById(R.id.X12);
        X13 = (EditText) findViewById(R.id.X13);
        findViewById(R.id.btnLimpiar).setOnClickListener(this);
        findViewById(R.id.btnResolver).setOnClickListener(this);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btnLimpiar:
                Limpiar();
                break;
            case R.id.btnResolver:
                break;
        }

    }
    private void Limpiar(){
        X5.setText("");
        X6.setText("");
        X7.setText("");
        X8.setText("");
        X9.setText("");
        X10.setText("");
        X11.setText("");
        X12.setText("");
        X13.setText("");
        X5.requestFocus();
    }

}
