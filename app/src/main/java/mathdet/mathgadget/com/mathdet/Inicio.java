package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mAdView = findViewById(R.id.adView);
        MobileAds.initialize(this, R.string.AdMobId + "");
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial + "");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        findViewById(R.id.btnAdjunta).setOnClickListener(this);
        findViewById(R.id.btnDeterminante).setOnClickListener(this);
        findViewById(R.id.btnInversa).setOnClickListener(this);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()) {
            case R.id.btnDeterminante:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc", 1);
                break;
            case R.id.btnAdjunta:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc", 2);
                break;
            case R.id.btnInversa:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc", 3);
                break;
        }
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
