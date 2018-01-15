package mathdet.mathgadget.com.mathdet.Adjunta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mathdet.mathgadget.com.mathdet.R;

public class Adj_Pasos_3x3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_pasos_3x3);
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Paso1:
                startActivity(new Intent(getApplicationContext(), Adj_Pasos1_3x3.class));
                break;
            case R.id.Paso2:
                startActivity(new Intent(getApplicationContext(), Adj_Pasos2_3x3.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
