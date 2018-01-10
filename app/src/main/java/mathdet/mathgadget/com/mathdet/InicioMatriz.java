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
        Bundle i = getIntent().getExtras();
        switch(view.getId()){
            case R.id.dos:
                startActivity(new Intent(getApplicationContext(), dos.class).putExtra("Opcion", i.getInt("Opcion")));
                break;
            case R.id.tres:
                startActivity(new Intent(getApplicationContext(), tres.class).putExtra("Opcion", i.getInt("Opcion")));
                break;
            case R.id.cuatro:
                startActivity(new Intent(getApplicationContext(), cuatro.class).putExtra("Opcion", i.getInt("Opcion")));
                break;
        }
    }
}
