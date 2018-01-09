package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioMatriz extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_matriz);
        findViewById(R.id.dos).setOnClickListener(this);
        findViewById(R.id.tres).setOnClickListener(this);
        findViewById(R.id.cuatro).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dos:
                startActivity(Opcion("dos"));
                break;
            case R.id.tres:
                startActivity(Opcion("tres"));
                break;
            case R.id.cuatro:
                startActivity(Opcion("cuatro"));
                break;
        }
    }
    private Intent Opcion(String Nombre) {
        Bundle i = getIntent().getExtras();
        Intent intent = new Intent(getApplicationContext(), mathdet.mathgadget.com.mathdet.Determinante.dos.class);
        switch (i.getString("Opción")) {
            case "determinante":
                intent.setClassName(getPackageName(), getPackageName()+".Determinante."+Nombre);
                break;
            case "inversa":
                intent.setClassName(getPackageName(), getPackageName()+".Inversa."+Nombre);
                break;
            case "adjunta":
                intent.setClassName(getPackageName(), getPackageName()+".Adjunta."+Nombre);
                break;
        }
        return  intent;
    }
}
