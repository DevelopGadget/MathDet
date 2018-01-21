package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
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
        Intent i = null;
        Bundle io = getIntent().getExtras();
        switch(view.getId()){
            case R.id.dos:
                i = new Intent(getApplicationContext(), dos.class);
                break;
            case R.id.tres:
                i = new Intent(getApplicationContext(), tres.class);
                break;
            case R.id.cuatro:
                i = new Intent(getApplicationContext(), cuatro.class);
                break;
        }
        i.putExtra("Opcion", io.getInt("Opc"));
        startActivity(i);
    }
}
