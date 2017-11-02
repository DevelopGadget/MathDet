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
        findViewById(R.id.dos).setOnClickListener(this);
        findViewById(R.id.tres).setOnClickListener(this);
        findViewById(R.id.cuatro).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.dos:
                Intent dos = new Intent(getApplicationContext(), dos.class);
                startActivity(dos);
                break;
            case R.id.tres:
                startActivity(new Intent(getApplicationContext(), tres.class));
                break;
            case R.id.cuatro:
                startActivity(new Intent(getApplicationContext(), cuatro.class));
                break;
        }
    }
}
