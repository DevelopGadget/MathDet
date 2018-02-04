package mathdet.mathgadget.com.mathdet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_2x2;
import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_4x4;
import mathdet.mathgadget.com.mathdet.Determinante.Pasos4x4;

public class cuatro extends AppCompatActivity implements View.OnClickListener {

    private EditText X14, X15, X16, X17, X18, X19, X20, X21, X22, X23, X24, X25, X26, X27, X28, X29;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
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
        Botones();
        X14.requestFocus();
    }

    private void Botones() {
        X14 =  findViewById(R.id.X14);
        X15 =  findViewById(R.id.X15);
        X16 =  findViewById(R.id.X16);
        X17 =  findViewById(R.id.X17);
        X18 =  findViewById(R.id.X18);
        X19 =  findViewById(R.id.X19);
        X20 =  findViewById(R.id.X20);
        X21 =  findViewById(R.id.X21);
        X22 =  findViewById(R.id.X22);
        X23 =  findViewById(R.id.X23);
        X24 =  findViewById(R.id.X24);
        X25 =  findViewById(R.id.X25);
        X26 =  findViewById(R.id.X26);
        X27 =  findViewById(R.id.X27);
        X28 =  findViewById(R.id.X28);
        X29 =  findViewById(R.id.X29);
        findViewById(R.id.btnLimpiar).setOnClickListener(this);
        findViewById(R.id.btnResolver).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLimpiar:
                Limpiar();
                break;
            case R.id.btnResolver:
                Resolver();
                break;
        }

    }

    private void Limpiar() {
        X14.setText("");
        X15.setText("");
        X16.setText("");
        X17.setText("");
        X18.setText("");
        X19.setText("");
        X20.setText("");
        X21.setText("");
        X22.setText("");
        X23.setText("");
        X24.setText("");
        X25.setText("");
        X26.setText("");
        X27.setText("");
        X28.setText("");
        X29.setText("");
        X14.requestFocus();
    }

    private void Resolver() {
        if (X14.getText().toString() == null || X14.getText().toString().equals("") || X15.getText().toString() == null || X15.getText().toString().equals("")
                || X16.getText().toString() == null || X16.getText().toString().equals("") || X18.getText().toString() == null || X19.getText().toString().equals("")
                || X21.getText().toString() == null || X21.getText().toString().equals("") || X20.getText().toString() == null || X20.getText().toString().equals("")
                || X22.getText().toString() == null || X22.getText().toString().equals("") || X23.getText().toString() == null || X23.getText().toString().equals("")
                || X25.getText().toString() == null || X25.getText().toString().equals("") || X24.getText().toString() == null || X24.getText().toString().equals("")
                || X26.getText().toString() == null || X26.getText().toString().equals("") || X27.getText().toString() == null || X27.getText().toString().equals("")
                || X29.getText().toString() == null || X29.getText().toString().equals("") || X28.getText().toString() == null || X28.getText().toString().equals("")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("ERROR!");
            builder.setIcon(R.drawable.error);
            builder.setMessage("Ha Dejado Campos Vacios");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        } else {
            Intent intent = Opcion();
            intent.putExtra("x14", Double.parseDouble(X14.getText().toString()));
            intent.putExtra("x15", Double.parseDouble(X15.getText().toString()));
            intent.putExtra("x16", Double.parseDouble(X16.getText().toString()));
            intent.putExtra("x17", Double.parseDouble(X17.getText().toString()));
            intent.putExtra("x18", Double.parseDouble(X18.getText().toString()));
            intent.putExtra("x19", Double.parseDouble(X19.getText().toString()));
            intent.putExtra("x20", Double.parseDouble(X20.getText().toString()));
            intent.putExtra("x21", Double.parseDouble(X21.getText().toString()));
            intent.putExtra("x22", Double.parseDouble(X22.getText().toString()));
            intent.putExtra("x23", Double.parseDouble(X23.getText().toString()));
            intent.putExtra("x24", Double.parseDouble(X24.getText().toString()));
            intent.putExtra("x25", Double.parseDouble(X25.getText().toString()));
            intent.putExtra("x26", Double.parseDouble(X26.getText().toString()));
            intent.putExtra("x29", Double.parseDouble(X29.getText().toString()));
            intent.putExtra("x28", Double.parseDouble(X28.getText().toString()));
            intent.putExtra("x27", Double.parseDouble(X27.getText().toString()));
            startActivity(intent);
        }
    }

    private Intent Opcion() {
        Bundle o = getIntent().getExtras();
        int i = o.getInt("Opcion");
        switch (i) {
            case 1:
                return new Intent(getApplicationContext(), Pasos4x4.class);
            case 2:
                return new Intent(getApplicationContext(), Adj_Pasos_4x4.class);
            default:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
