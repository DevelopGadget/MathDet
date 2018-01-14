package mathdet.mathgadget.com.mathdet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_2x2;
import mathdet.mathgadget.com.mathdet.Determinante.Pasos4x4;

public class cuatro extends AppCompatActivity implements View.OnClickListener {

    EditText X14, X15, X16, X17, X18, X19, X20, X21, X22, X23, X24, X25, X26, X27, X28, X29;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        Botones();
        X14.requestFocus();
    }

    private void Botones() {
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

        switch (view.getId()) {
            case R.id.btnLimpiar:
                Limpiar();
                break;
            case R.id.btnResolver:
                Resolver();
                break;
        }

    }

    private void Limpiar() {
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

    private void Resolver() {

        if (X14.getText().toString() == null || X14.getText().toString().equals("") || X15.getText().toString() == null || X15.getText().toString().equals("")
                || X16.getText().toString() == null || X16.getText().toString().equals("") || X18.getText().toString() == null || X19.getText().toString().equals("")
                || X21.getText().toString() == null || X21.getText().toString().equals("") || X20.getText().toString() == null || X20.getText().toString().equals("")
                || X22.getText().toString() == null || X22.getText().toString().equals("") || X23.getText().toString() == null || X23.getText().toString().equals("")
                || X25.getText().toString() == null || X25.getText().toString().equals("") || X24.getText().toString() == null || X24.getText().toString().equals("")
                || X26.getText().toString() == null || X26.getText().toString().equals("") || X27.getText().toString() == null || X27.getText().toString().equals("")
                || X29.getText().toString() == null || X29.getText().toString().equals("") || X28.getText().toString() == null || X28.getText().toString().equals("")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("ERROR!");
            builder.setIcon(R.drawable.error);
            builder.setMessage("Ha Dejado Campos Vacios");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        } else {
            final double x14, x15, x16, x17, x18, x19, x20, x21, x22, x23, x24, x25, x26, x27, x28, x29, Det1, Det2, Det3, Det4;
            x14 = Double.parseDouble(X14.getText().toString());
            x15 = Double.parseDouble(X15.getText().toString());
            x16 = Double.parseDouble(X16.getText().toString());
            x17 = Double.parseDouble(X17.getText().toString());
            x18 = Double.parseDouble(X18.getText().toString());
            x19 = Double.parseDouble(X19.getText().toString());
            x20 = Double.parseDouble(X20.getText().toString());
            x21 = Double.parseDouble(X21.getText().toString());
            x22 = Double.parseDouble(X22.getText().toString());
            x23 = Double.parseDouble(X23.getText().toString());
            x24 = Double.parseDouble(X24.getText().toString());
            x25 = Double.parseDouble(X25.getText().toString());
            x26 = Double.parseDouble(X26.getText().toString());
            x27 = Double.parseDouble(X27.getText().toString());
            x28 = Double.parseDouble(X28.getText().toString());
            x29 = Double.parseDouble(X29.getText().toString());
            Det1 = x14 * (Math.pow(-1, 2) * ((x19 * x24 * x29 + x23 * x28 * x21 + x27 * x20 * x25) - (x21 * x24 * x27 + x25 * x28 * x19 + x29 * x20 * x23)));
            Det2 = x15 * (Math.pow(-1, 3) * ((x18 * x24 * x29 + x22 * x28 * x21 + x26 * x20 * x25) - (x21 * x24 * x26 + x25 * x28 * x18 + x29 * x20 * x22)));
            Det3 = x16 * (Math.pow(-1, 4) * ((x18 * x23 * x29 + x22 * x27 * x21 + x26 * x19 * x25) - (x21 * x23 * x26 + x25 * x27 * x18 + x29 * x19 * x22)));
            Det4 = x17 * (Math.pow(-1, 5) * ((x18 * x23 * x28 + x22 * x27 * x20 + x26 * x19 * x24) - (x20 * x23 * x26 + x24 * x27 * x18 + x28 * x19 * x22)));
            Intent intent = Opcion();
            intent.putExtra("Parte1Det1", (x19 * x24 * x29 + x23 * x28 * x21 + x27 * x20 * x25));
            intent.putExtra("Parte2Det1", (x21 * x24 * x27 + x25 * x28 * x19 + x29 * x20 * x23));
            intent.putExtra("Parte1Det2", (x18 * x24 * x29 + x22 * x28 * x21 + x26 * x20 * x25));
            intent.putExtra("Parte2Det2", (x21 * x24 * x26 + x25 * x28 * x18 + x29 * x20 * x22));
            intent.putExtra("Parte1Det3", (x18 * x23 * x29 + x22 * x27 * x21 + x26 * x19 * x25));
            intent.putExtra("Parte2Det3", (x21 * x23 * x26 + x25 * x27 * x18 + x29 * x19 * x22));
            intent.putExtra("Parte1Det4", (x18 * x23 * x28 + x22 * x27 * x20 + x26 * x19 * x24));
            intent.putExtra("Parte2Det4", (x20 * x23 * x26 + x24 * x27 * x18 + x28 * x19 * x22));
            intent.putExtra("Resul", (Det1 + Det2 + Det3 + Det4));
            intent.putExtra("Det1", Det1);
            intent.putExtra("Det2", Det2);
            intent.putExtra("Det3", Det3);
            intent.putExtra("Det4", Det4);
            intent.putExtra("x14", x14);
            intent.putExtra("x15", x15);
            intent.putExtra("x16", x16);
            intent.putExtra("x17", x17);
            intent.putExtra("x21", x21);
            intent.putExtra("x20", x20);
            intent.putExtra("x19", x19);
            intent.putExtra("x18", x18);
            intent.putExtra("x23", x23);
            intent.putExtra("x24", x24);
            intent.putExtra("x25", x25);
            intent.putExtra("x26", x26);
            intent.putExtra("x22", x22);
            intent.putExtra("x29", x29);
            intent.putExtra("x28", x28);
            intent.putExtra("x27", x27);
            startActivity(intent);
        }

    }

    private Intent Opcion() {
        Bundle o = getIntent().getExtras();
        switch (o.getInt("Opcion")) {
            case 1:
                return new Intent(getApplicationContext(), Pasos4x4.class);
            case 2:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
            default:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
