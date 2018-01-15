package mathdet.mathgadget.com.mathdet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_2x2;
import mathdet.mathgadget.com.mathdet.Determinante.Pasos2X2;
import mathdet.mathgadget.com.mathdet.R;

public class dos extends AppCompatActivity implements View.OnClickListener {

    private EditText ex1,ex2,ex3,ex4;
    public dos(){

    }
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
                Resolver();
                break;
        }
    }
    private void Resolver(){

        if (ex1.getText().toString() == null || ex1.getText().toString().equals("")
                || ex2.getText().toString() == null || ex2.getText().toString().equals("")
                || ex3.getText().toString() == null || ex3.getText().toString().equals("")
                || ex4.getText().toString() == null || ex4.getText().toString().equals("")) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("ERROR!");
            builder.setIcon(R.drawable.error);
            builder.setMessage("Ha Dejado Campos Vacios");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {}
            });
            builder.show();

        }else {
            Intent i = Opcion();
            i.putExtra("X1", Double.parseDouble(ex1.getText().toString()));
            i.putExtra("X2", Double.parseDouble(ex2.getText().toString()));
            i.putExtra("X3", Double.parseDouble(ex3.getText().toString()));
            i.putExtra("X4", Double.parseDouble(ex4.getText().toString()));
            startActivity(i);
        }
    }
    private Intent Opcion(){
        Bundle o = getIntent().getExtras();
        int i = o.getInt("Opcion");
        switch (i){
            case 1:
                return new Intent(getApplicationContext(), Pasos2X2.class);
            case 2:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
            default:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
        }
    }
}
