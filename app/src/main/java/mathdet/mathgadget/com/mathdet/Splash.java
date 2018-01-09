package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    private ProgressBar barra;
    private int pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        barra = (ProgressBar) findViewById(R.id.progressBar);
        new CountDownTimer(3300, 80) {

            int progreso = 1; // Variable que va a ir aumentando del progreso
            @Override
            public void onTick(long millisUntilFinished) {
                barra.setProgress(progreso);
                progreso += 4;
            }

            @Override
            public void onFinish() {
                barra.setProgress(100);
                finish();
                Intent inicio = new Intent(getApplicationContext(), Inicio.class);
                startActivity(inicio);
            }
        }.start();

    }
}
