package mathdet.mathgadget.com.mathdet.Adjunta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Adj_Pasos2_3x3 extends AppCompatActivity {

    private TextView X5,X6,X7,X8,X9,X10,X11,X12,X13;
    private TextView X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1;
    private Bundle Datos;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_pasos2_3x3);
        mAdView = findViewById(R.id.adView);
        MobileAds.initialize(this, R.string.AdMobId+"");
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        Datos = getIntent().getExtras();
        Instancias();
        Texto();
    }
    private void Instancias(){
        X5 =  findViewById(R.id.X5);
        X6 =  findViewById(R.id.X6);
        X7 =  findViewById(R.id.X7);
        X8 =  findViewById(R.id.X8);
        X9 =  findViewById(R.id.X9);
        X10 =  findViewById(R.id.X10);
        X11 =  findViewById(R.id.X11);
        X12 =  findViewById(R.id.X12);
        X13 =  findViewById(R.id.X13);
        X5_1 =  findViewById(R.id.X5_1);
        X6_1 =  findViewById(R.id.X6_1);
        X7_1 =  findViewById(R.id.X7_1);
        X8_1 =  findViewById(R.id.X8_1);
        X9_1 =  findViewById(R.id.X9_1);
        X10_1 =  findViewById(R.id.X10_1);
        X11_1 =  findViewById(R.id.X11_1);
        X12_1 =  findViewById(R.id.X12_1);
        X13_1 =  findViewById(R.id.X13_1);
    }
    private void Texto(){
        X5_1.setText(Datos.getString("X5"));
        X6_1.setText(Datos.getString("X6"));
        X7_1.setText(Datos.getString("X7"));
        X8_1.setText(Datos.getString("X8"));
        X9_1.setText(Datos.getString("X9"));
        X10_1.setText(Datos.getString("X10"));
        X11_1.setText(Datos.getString("X11"));
        X12_1.setText(Datos.getString("X12"));
        X13_1.setText(Datos.getString("X13"));
        X5.setText(Datos.getString("X5"));
        X8.setText(Datos.getString("X6"));
        X11.setText(Datos.getString("X7"));
        X6.setText(Datos.getString("X8"));
        X9.setText(Datos.getString("X9"));
        X12.setText(Datos.getString("X10"));
        X7.setText(Datos.getString("X11"));
        X10.setText(Datos.getString("X12"));
        X13.setText(Datos.getString("X13"));
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
