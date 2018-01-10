package mathdet.mathgadget.com.mathdet.Inversa;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mathdet.mathgadget.com.mathdet.Determinante.Pasos2X2;
import mathdet.mathgadget.com.mathdet.R;

public class dos extends AppCompatActivity implements View.OnClickListener {

    private EditText ex1,ex2,ex3,ex4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        ex1 = (EditText) findViewById(R.id.X1);
        ex2 = (EditText) findViewById(R.id.X2);
        ex3 = (EditText) findViewById(R.id.X3);
        ex4 = (EditText) findViewById(R.id.X4);
        ex1.requestFocus();
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
        switch(view.getId()) {
            case R.id.btnLimpiar:
                ex1.setText("");
                ex2.setText("");
                ex3.setText("");
                ex4.setText("");
                ex1.requestFocus();
                break;
            case R.id.btnResolver:

                break;
        }
    }
}
