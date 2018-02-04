package mathdet.mathgadget.com.mathdet.Adjunta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Adj_Pasos_3x3 extends AppCompatActivity implements View.OnClickListener{

    private TextView X5,X6,X7,X8,X9,X10,X11,X12,X13,X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1;
    private Bundle Tres;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_pasos_3x3);
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
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);
        Instancias();
        Tres = getIntent().getExtras();
        Texto();
    }

    private void Instancias(){
        X5 = findViewById(R.id.X5);
        X5_1 = findViewById(R.id.X5_1);
        X6 = findViewById(R.id.X6);
        X6_1 = findViewById(R.id.X6_1);
        X7 = findViewById(R.id.X7);
        X7_1 = findViewById(R.id.X7_1);
        X8 = findViewById(R.id.X8);
        X8_1 = findViewById(R.id.X8_1);
        X9 = findViewById(R.id.X9);
        X9_1 = findViewById(R.id.X9_1);
        X10 = findViewById(R.id.X10);
        X10_1 = findViewById(R.id.X10_1);
        X11 = findViewById(R.id.X11);
        X11_1 = findViewById(R.id.X11_1);
        X12 = findViewById(R.id.X12);
        X12_1 = findViewById(R.id.X12_1);
        X13 = findViewById(R.id.X13);
        X13_1 = findViewById(R.id.X13_1);
    }

    private void Texto(){
        X5.setText(Tres.getDouble("x5") + "");
        X6.setText(Tres.getDouble("x6") + "");
        X7.setText(Tres.getDouble("x7") + "");
        X8.setText(Tres.getDouble("x8") + "");
        X9.setText(Tres.getDouble("x9") + "");
        X10.setText(Tres.getDouble("x10") + "");
        X11.setText(Tres.getDouble("x11") + "");
        X12.setText(Tres.getDouble("x12") + "");
        X13.setText(Tres.getDouble("x13") + "");
        X5_1.setText(Cofactor(1, Tres.getDouble("x9"), Tres.getDouble("x10"), Tres.getDouble("x12"), Tres.getDouble("x13")) + "");
        X6_1.setText(Cofactor(-1, Tres.getDouble("x6"), Tres.getDouble("x7"), Tres.getDouble("x12"), Tres.getDouble("x13")) + "");
        X7_1.setText(Cofactor(1, Tres.getDouble("x6"), Tres.getDouble("x7"), Tres.getDouble("x9"), Tres.getDouble("x10")) + "");
        X8_1.setText(Cofactor(-1, Tres.getDouble("x8"), Tres.getDouble("x10"), Tres.getDouble("x11"), Tres.getDouble("x13")) + "");
        X9_1.setText(Cofactor(1, Tres.getDouble("x5"), Tres.getDouble("x7"), Tres.getDouble("x11"), Tres.getDouble("x13")) + "");
        X10_1.setText(Cofactor(-1, Tres.getDouble("x5"), Tres.getDouble("x7"), Tres.getDouble("x8"), Tres.getDouble("x10")) + "");
        X11_1.setText(Cofactor(1, Tres.getDouble("x8"), Tres.getDouble("x9"), Tres.getDouble("x11"), Tres.getDouble("x12")) + "");
        X12_1.setText(Cofactor(-1, Tres.getDouble("x5"), Tres.getDouble("x6"), Tres.getDouble("x11"), Tres.getDouble("x12")) + "");
        X13_1.setText(Cofactor(1, Tres.getDouble("x5"), Tres.getDouble("x6"), Tres.getDouble("x8"), Tres.getDouble("x9")) + "");
    }

    private double Cofactor(int Cofactor, double X1, double X2, double X3, double X4){
        return Cofactor * (X1 * X4 - X2 * X3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Paso1:
                startActivity(new Intent(getApplicationContext(), Adj_Pasos1_3x3.class)
                 .putExtra("Col1", new double[]{Double.parseDouble(X5_1.getText().toString()), Double.parseDouble(X6_1.getText().toString()), Double.parseDouble(X7_1.getText().toString()), 1, -1, 1,
                        Tres.getDouble("x9"), Tres.getDouble("x6"), Tres.getDouble("x6"), Tres.getDouble("x10"), Tres.getDouble("x7"), Tres.getDouble("x7"), Tres.getDouble("x12"),
                        Tres.getDouble("x12"), Tres.getDouble("x9"), Tres.getDouble("x13"), Tres.getDouble("x13"), Tres.getDouble("x10")})
                .putExtra("Col2", new double[]{Double.parseDouble(X8_1.getText().toString()), Double.parseDouble(X9_1.getText().toString()), Double.parseDouble(X10_1.getText().toString()), -1, 1, -1,
                        Tres.getDouble("x8"), Tres.getDouble("x5"), Tres.getDouble("x5"), Tres.getDouble("x10"), Tres.getDouble("x7"), Tres.getDouble("x7"), Tres.getDouble("x11"),
                        Tres.getDouble("x11"), Tres.getDouble("x8"), Tres.getDouble("x13"), Tres.getDouble("x13"), Tres.getDouble("x10")})
                .putExtra("Col3", new double[]{Double.parseDouble(X11_1.getText().toString()), Double.parseDouble(X12_1.getText().toString()), Double.parseDouble(X13_1.getText().toString()), 1, -1, 1,
                        Tres.getDouble("x8"), Tres.getDouble("x5"), Tres.getDouble("x5"), Tres.getDouble("x9"), Tres.getDouble("x6"), Tres.getDouble("x6"), Tres.getDouble("x11"),
                        Tres.getDouble("x11"), Tres.getDouble("x8"), Tres.getDouble("x12"), Tres.getDouble("x12"), Tres.getDouble("x9")}));
                break;
            case R.id.Paso2:
                startActivity(new Intent(getApplicationContext(), Adj_Pasos2_3x3.class)
                .putExtra("X5", X5_1.getText().toString())
                .putExtra("X6", X6_1.getText().toString())
                .putExtra("X7", X7_1.getText().toString())
                .putExtra("X8", X8_1.getText().toString())
                .putExtra("X9", X9_1.getText().toString())
                .putExtra("X10", X10_1.getText().toString())
                .putExtra("X11", X11_1.getText().toString())
                .putExtra("X12", X12_1.getText().toString())
                .putExtra("X13", X13_1.getText().toString()));
                break;
        }
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
