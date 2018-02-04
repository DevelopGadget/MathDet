package mathdet.mathgadget.com.mathdet.Determinante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Pasos2X2 extends AppCompatActivity {

    private TextView X1,X2,X3,X4,Diagonal1,Diagonal2,Resul,fin;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos2_x2);
        MobileAds.initialize(this, R.string.AdMobId+"");
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(R.string.AdMobId_Intertisial+"");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
        });
        X1 =  findViewById(R.id.X1);
        X2 =  findViewById(R.id.X2);
        X3 =  findViewById(R.id.X3);
        X4 =  findViewById(R.id.X4);
        Diagonal1 =  findViewById(R.id.Diagonal1);
        Diagonal2 =  findViewById(R.id.Diagonal2);
        fin =  findViewById(R.id.textView18);
        Resul =  findViewById(R.id.textView16);
        Bundle bundle = getIntent().getExtras();
        Diagonal1.setText(String.valueOf(bundle.getDouble("X1"))+" * "+String.valueOf(bundle.getDouble("X4")) + " = " + (bundle.getDouble("X1") * bundle.getDouble("X4")));
        Diagonal2.setText(String.valueOf(bundle.getDouble("X3"))+" * "+String.valueOf(bundle.getDouble("X2")) + " = " + (bundle.getDouble("X3") * bundle.getDouble("X2")));
        Resul.setText("( "+ (bundle.getDouble("X1") * bundle.getDouble("X4")) + " )" + " - " + "(" + (bundle.getDouble("X3") * bundle.getDouble("X2")) + " )");
        fin.setText("= "+ ((bundle.getDouble("X1") * bundle.getDouble("X4")) - (bundle.getDouble("X3") * bundle.getDouble("X2"))));
        X1.setText(String.valueOf(bundle.getDouble("X1")));
        X2.setText(String.valueOf(bundle.getDouble("X2")));
        X3.setText(String.valueOf(bundle.getDouble("X3")));
        X4.setText(String.valueOf(bundle.getDouble("X4")));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
