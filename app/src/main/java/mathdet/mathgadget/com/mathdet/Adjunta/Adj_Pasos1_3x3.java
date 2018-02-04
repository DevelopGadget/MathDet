package mathdet.mathgadget.com.mathdet.Adjunta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import mathdet.mathgadget.com.mathdet.Determinante.Pasos2X2;
import mathdet.mathgadget.com.mathdet.R;

public class Adj_Pasos1_3x3 extends AppCompatActivity implements View.OnClickListener{

    private TextView Cofactor1,Cofactor2,Cofactor3,X1_1,X1_2,X1_3,X2_1,X2_2,X2_3,X3_1,X3_2,X3_3,X4_1,X4_2,X4_3,Det1,Det2,Det3;
    private Bundle Datos;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_pasos1_3x3);
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
        Datos = getIntent().getExtras();
        Instancias();
    }

    private void Instancias(){
        findViewById(R.id.btnCol1).setOnClickListener(this);
        findViewById(R.id.btnCol2).setOnClickListener(this);
        findViewById(R.id.btnCol3).setOnClickListener(this);
        findViewById(R.id.btnDet1).setOnClickListener(this);
        findViewById(R.id.btnDet2).setOnClickListener(this);
        findViewById(R.id.btnDet3).setOnClickListener(this);
        Cofactor1 = findViewById(R.id.Cofactor1);
        Cofactor2 = findViewById(R.id.Cofactor2);
        Cofactor3 = findViewById(R.id.Cofactor3);
        X1_1 = findViewById(R.id.X1_1);
        X1_2 = findViewById(R.id.X1_2);
        X1_3 = findViewById(R.id.X1_3);
        X2_1 = findViewById(R.id.X2_1);
        X2_2 = findViewById(R.id.X2_2);
        X2_3 = findViewById(R.id.X2_3);
        X3_1 = findViewById(R.id.X3_1);
        X3_2 = findViewById(R.id.X3_2);
        X3_3 = findViewById(R.id.X3_3);
        X4_1 = findViewById(R.id.X4_1);
        X4_2 = findViewById(R.id.X4_2);
        X4_3 = findViewById(R.id.X4_3);
        Det1 = findViewById(R.id.Det1);
        Det2 = findViewById(R.id.Det2);
        Det3 = findViewById(R.id.Det3);
        findViewById(R.id.btnCol1).performClick();
    }

    private void Texto(String Det1, String Det2, String Det3, String Cofactor1, String Cofactor2, String Cofactor3, String X1_1, String X1_2, String X1_3, String X2_1, String X2_2,
                       String X2_3, String X3_1, String X3_2, String X3_3, String X4_1, String X4_2, String X4_3){
        this.Det1.setText(Det1);
        this.Det2.setText(Det2);
        this.Det3.setText(Det3);
        this.Cofactor1.setText(Cofactor1);
        this.Cofactor2.setText(Cofactor2);
        this.Cofactor3.setText(Cofactor3);
        this.X1_1.setText(X1_1);
        this.X1_2.setText(X1_2);
        this.X1_3.setText(X1_3);
        this.X2_1.setText(X2_1);
        this.X2_2.setText(X2_2);
        this.X2_3.setText(X2_3);
        this.X3_1.setText(X3_1);
        this.X3_2.setText(X3_2);
        this.X3_3.setText(X3_3);
        this.X4_1.setText(X4_1);
        this.X4_2.setText(X4_2);
        this.X4_3.setText(X4_3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCol1:
                TextoBoton("Col1");
                Toast.makeText(getApplicationContext(), "Actualmente En La Columna 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCol2:
                TextoBoton("Col2");
                Toast.makeText(getApplicationContext(), "Actualmente En La Columna 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCol3:
                TextoBoton("Col3");
                Toast.makeText(getApplicationContext(), "Actualmente En La Columna 3", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDet1:
                Paso2x2(Double.parseDouble(X1_1.getText().toString()), Double.parseDouble(X2_1.getText().toString()), Double.parseDouble(X3_1.getText().toString()),
                        Double.parseDouble(X4_1.getText().toString()));
                break;
            case R.id.btnDet2:
                Paso2x2(Double.parseDouble(X1_2.getText().toString()), Double.parseDouble(X2_2.getText().toString()), Double.parseDouble(X3_2.getText().toString()),
                        Double.parseDouble(X4_2.getText().toString()));
                break;
            case R.id.btnDet3:
                Paso2x2(Double.parseDouble(X1_3.getText().toString()), Double.parseDouble(X2_3.getText().toString()), Double.parseDouble(X3_3.getText().toString()),
                        Double.parseDouble(X4_3.getText().toString()));
                break;
        }
    }

    private void Paso2x2(double X1, double X2, double X3, double X4){
        startActivity(new Intent(getApplicationContext(), Pasos2X2.class)
                .putExtra("X1", X1)
                .putExtra("X2", X2)
                .putExtra("X3", X3)
                .putExtra("X4", X4));
    }

    private void TextoBoton(String Key){
        Texto(Datos.getDoubleArray(Key)[0]+"", Datos.getDoubleArray(Key)[1]+"", Datos.getDoubleArray(Key)[2]+"", Datos.getDoubleArray(Key)[3]+"",
                Datos.getDoubleArray(Key)[4]+"", Datos.getDoubleArray(Key)[5]+"", Datos.getDoubleArray(Key)[6]+"", Datos.getDoubleArray(Key)[7]+"",
                Datos.getDoubleArray(Key)[8]+"", Datos.getDoubleArray(Key)[9]+"", Datos.getDoubleArray(Key)[10]+"", Datos.getDoubleArray(Key)[11]+"",
                Datos.getDoubleArray(Key)[12]+"", Datos.getDoubleArray(Key)[13]+"", Datos.getDoubleArray(Key)[14]+"", Datos.getDoubleArray(Key)[15]+"",
                Datos.getDoubleArray(Key)[16]+"", Datos.getDoubleArray(Key)[17]+"");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
