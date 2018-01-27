package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Splash extends AppCompatActivity {

    private ProgressBar barra;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        barra = findViewById(R.id.progressBar);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
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

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
        finish();
    }
}
