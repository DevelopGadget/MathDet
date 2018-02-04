package mathdet.mathgadget.com.mathdet.Adjunta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Adj_Paso2_4x4 extends AppCompatActivity {

    private TextView X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27,X28,X29;
    private TextView X14_1,X15_1,X16_1,X17_1,X18_1,X19_1,X20_1,X21_1,X22_1,X23_1,X24_1,X25_1,X26_1,X27_1,X28_1,X29_1;
    private InterstitialAd mInterstitialAd;
    private Bundle Cuatro;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_paso2_4x4);
        mAdView = findViewById(R.id.adView);
        MobileAds.initialize(this, R.string.AdMobId+"");
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        Instancias();
        Cuatro = getIntent().getExtras();
        Texto();
        Texto1();
    }

    private void Instancias() {
        X14 = findViewById(R.id.X14);
        X15 = findViewById(R.id.X15);
        X16 = findViewById(R.id.X16);
        X17 = findViewById(R.id.X17);
        X18 = findViewById(R.id.X18);
        X19 = findViewById(R.id.X19);
        X20 = findViewById(R.id.X20);
        X21 = findViewById(R.id.X21);
        X22 = findViewById(R.id.X22);
        X23 = findViewById(R.id.X23);
        X24 = findViewById(R.id.X24);
        X25 = findViewById(R.id.X25);
        X26 = findViewById(R.id.X26);
        X27 = findViewById(R.id.X27);
        X28 = findViewById(R.id.X28);
        X29 = findViewById(R.id.X29);
        X14_1 = findViewById(R.id.X14_1);
        X15_1 = findViewById(R.id.X15_1);
        X16_1 = findViewById(R.id.X16_1);
        X17_1 = findViewById(R.id.X17_1);
        X18_1 = findViewById(R.id.X18_1);
        X19_1 = findViewById(R.id.X19_1);
        X20_1 = findViewById(R.id.X20_1);
        X21_1 = findViewById(R.id.X21_1);
        X22_1 = findViewById(R.id.X22_1);
        X23_1 = findViewById(R.id.X23_1);
        X24_1 = findViewById(R.id.X24_1);
        X25_1 = findViewById(R.id.X25_1);
        X26_1 = findViewById(R.id.X26_1);
        X27_1 = findViewById(R.id.X27_1);
        X28_1 = findViewById(R.id.X28_1);
        X29_1 = findViewById(R.id.X29_1);
    }

    private void Texto(){
        X14_1.setText(Cuatro.getString("x14"));
        X15_1.setText(Cuatro.getString("x15"));
        X16_1.setText(Cuatro.getString("x16"));
        X17_1.setText(Cuatro.getString("x17"));
        X18_1.setText(Cuatro.getString("x18"));
        X19_1.setText(Cuatro.getString("x19"));
        X20_1.setText(Cuatro.getString("x20"));
        X21_1.setText(Cuatro.getString("x21"));
        X22_1.setText(Cuatro.getString("x22"));
        X23_1.setText(Cuatro.getString("x23"));
        X24_1.setText(Cuatro.getString("x24"));
        X25_1.setText(Cuatro.getString("x25"));
        X26_1.setText(Cuatro.getString("x26"));
        X27_1.setText(Cuatro.getString("x27"));
        X28_1.setText(Cuatro.getString("x28"));
        X29_1.setText(Cuatro.getString("x29"));
    }

    private void Texto1(){
        X14.setText(Cuatro.getString("x14"));
        X15.setText(Cuatro.getString("x18"));
        X16.setText(Cuatro.getString("x22"));
        X17.setText(Cuatro.getString("x26"));
        X18.setText(Cuatro.getString("x15"));
        X19.setText(Cuatro.getString("x19"));
        X20.setText(Cuatro.getString("x23"));
        X21.setText(Cuatro.getString("x27"));
        X22.setText(Cuatro.getString("x16"));
        X23.setText(Cuatro.getString("x20"));
        X24.setText(Cuatro.getString("x24"));
        X25.setText(Cuatro.getString("x28"));
        X26.setText(Cuatro.getString("x17"));
        X27.setText(Cuatro.getString("x21"));
        X28.setText(Cuatro.getString("x25"));
        X29.setText(Cuatro.getString("x29"));
    }
}
