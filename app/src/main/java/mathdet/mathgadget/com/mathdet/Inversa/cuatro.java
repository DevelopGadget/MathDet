package mathdet.mathgadget.com.mathdet.Inversa;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mathdet.mathgadget.com.mathdet.Determinante.Pasos4x4;
import mathdet.mathgadget.com.mathdet.R;

public class cuatro extends AppCompatActivity implements View.OnClickListener{

    EditText X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27,X28,X29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        Botones();
        X14.requestFocus();
    }
    private void Botones(){
        X14 = (EditText) findViewById(R.id.X14);
        X15 = (EditText) findViewById(R.id.X15);
        X16 = (EditText) findViewById(R.id.X16);
        X17 = (EditText) findViewById(R.id.X17);
        X18 = (EditText) findViewById(R.id.X18);
        X19 = (EditText) findViewById(R.id.X19);
        X20 = (EditText) findViewById(R.id.X20);
        X21 = (EditText) findViewById(R.id.X21);
        X22 = (EditText) findViewById(R.id.X22);
        X23 = (EditText) findViewById(R.id.X23);
        X24 = (EditText) findViewById(R.id.X24);
        X25 = (EditText) findViewById(R.id.X25);
        X26 = (EditText) findViewById(R.id.X26);
        X27 = (EditText) findViewById(R.id.X27);
        X28 = (EditText) findViewById(R.id.X28);
        X29 = (EditText) findViewById(R.id.X29);
        findViewById(R.id.btnLimpiar).setOnClickListener(this);
        findViewById(R.id.btnResolver).setOnClickListener(this);
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
        X14.setText("");
        X15.setText("");
        X16.setText("");
        X17.setText("");
        X18.setText("");
        X19.setText("");
        X20.setText("");
        X21.setText("");
        X22.setText("");
        X23.setText("");
        X24.setText("");
        X25.setText("");
        X26.setText("");
        X27.setText("");
        X28.setText("");
        X29.setText("");
        X14.requestFocus();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
