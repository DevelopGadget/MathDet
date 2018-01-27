package mathdet.mathgadget.com.mathdet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Inicio extends AppCompatActivity implements View.OnClickListener{

    private AdView mAdView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mAdView = findViewById(R.id.adView);
        MobileAds.initialize(this,
                R.string.AdMobId+"");
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        findViewById(R.id.btnAdjunta).setOnClickListener(this);
        findViewById(R.id.btnDeterminante).setOnClickListener(this);
        findViewById(R.id.btnInversa).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = null;
        switch (view.getId()){
            case R.id.btnDeterminante:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc",1);
                break;
            case R.id.btnAdjunta:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc",2);
                break;
            case R.id.btnInversa:
                i = new Intent(getApplicationContext(), InicioMatriz.class);
                i.putExtra("Opc",3);
                break;
        }
        startActivity(i);
    }
}
