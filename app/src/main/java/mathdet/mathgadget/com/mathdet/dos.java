package mathdet.mathgadget.com.mathdet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

                }else{
                    final double x1,x2,x3,x4;
                    x1 = Double.parseDouble(ex1.getText().toString());
                    x2 = Double.parseDouble(ex2.getText().toString());
                    x3 = Double.parseDouble(ex3.getText().toString());
                    x4 = Double.parseDouble(ex4.getText().toString());
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("RESULTADO");
                    builder.setIcon(R.drawable.exito);
                    builder.setMessage("El Determinante De La Matriz 2x2 Es: "+((x1 * x4)-(x2 * x3)));
                    builder.setPositiveButton("Explicación", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent in = new Intent(getApplicationContext(), Pasos2X2.class);
                            in.putExtra("X1",x1);
                            in.putExtra("X2",x2);
                            in.putExtra("X3",x3);
                            in.putExtra("X4",x4);
                            startActivity(in);
                        }
                    });
                    builder.show();
                }
                break;
        }
    }
    private Boolean EsNumero(String i){
        boolean V = true;
        try{
            double h = Double.parseDouble(i);
        }catch(Exception e){V = false;}
        return V;
    }
}
