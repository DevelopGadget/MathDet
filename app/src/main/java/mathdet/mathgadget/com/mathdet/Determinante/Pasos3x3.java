package mathdet.mathgadget.com.mathdet.Determinante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.R;

public class Pasos3x3 extends AppCompatActivity implements View.OnClickListener{

    private TextView X5,X6,X7,X8,X9,X10,X11,X12,X13,Resul,Determinante;
    private Bundle var;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasos3x3);
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
        Intancias();
        var = getIntent().getExtras();
        X5.setText(String.valueOf(var.getDouble("x5")));
        X6.setText(String.valueOf(var.getDouble("x6")));
        X7.setText(String.valueOf(var.getDouble("x7")));
        X8.setText(String.valueOf(var.getDouble("x8")));
        X9.setText(String.valueOf(var.getDouble("x9")));
        X10.setText(String.valueOf(var.getDouble("x10")));
        X11.setText(String.valueOf(var.getDouble("x11")));
        X12.setText(String.valueOf(var.getDouble("x12")));
        X13.setText(String.valueOf(var.getDouble("x13")));
        Resul.setText("( " + Parte1() + " )" + " - " + "( " + Parte2() + " )");
        Determinante.setText("= "+ Determinante());
    }

    private void  Intancias(){
        X5 =  findViewById(R.id.X5);
        X6 =  findViewById(R.id.X6);
        X7 =  findViewById(R.id.X7);
        X8 =  findViewById(R.id.X8);
        X9 =  findViewById(R.id.X9);
        X10 =  findViewById(R.id.X10);
        X11 =  findViewById(R.id.X11);
        X12 =  findViewById(R.id.X12);
        X13 =  findViewById(R.id.X13);
        Resul =  findViewById(R.id.Resul);
        Determinante =  findViewById(R.id.Determinante);
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);
    }

    private double Determinante(){
        return ((var.getDouble("x5") * var.getDouble("x9") * var.getDouble("x13") + var.getDouble("x8") * var.getDouble("x12") * var.getDouble("x7") + var.getDouble("x11") * var.getDouble("x6") * var.getDouble("x10")) -
                (var.getDouble("x8") * var.getDouble("x6") * var.getDouble("x13") + var.getDouble("x5") * var.getDouble("x12") * var.getDouble("x10") + var.getDouble("x11") * var.getDouble("x9") * var.getDouble("x7")));
    }

    private double Parte1(){
        return (var.getDouble("x5") * var.getDouble("x9") * var.getDouble("x13") + var.getDouble("x8") * var.getDouble("x12") * var.getDouble("x7") + var.getDouble("x11") * var.getDouble("x6") * var.getDouble("x10"));
    }

    private double Parte2(){
        return (var.getDouble("x8") * var.getDouble("x6") * var.getDouble("x13") + var.getDouble("x5") * var.getDouble("x12") * var.getDouble("x10") + var.getDouble("x11") * var.getDouble("x9") * var.getDouble("x7"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View view) {
        var = getIntent().getExtras();
        Intent inte;
        switch (view.getId()){
            case R.id.Paso1:
                inte = new Intent(getApplicationContext(), Paso1_3x3.class);
                inte.putExtra("var",var);
                startActivity(inte);
                break;
            case R.id.Paso2:
                inte = new Intent(getApplicationContext(), Paso2_3x3.class);
                inte.putExtra("var",var);
                inte.putExtra("Parte1", Parte1());
                inte.putExtra("Parte2", Parte2());
                startActivity(inte);
                break;
        }
    }
}
