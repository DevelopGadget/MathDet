package mathdet.mathgadget.com.mathdet.Adjunta;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import org.w3c.dom.Text;

import mathdet.mathgadget.com.mathdet.Determinante.Pasos3x3;
import mathdet.mathgadget.com.mathdet.R;

public class Adj_Paso1_4x4 extends AppCompatActivity implements View.OnClickListener{

    private TextView Cofactor1,Cofactor2,Cofactor3,Cofactor4;
    private TextView X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1;
    private TextView X5_2,X6_2,X7_2,X8_2,X9_2,X10_2,X11_2,X12_2,X13_2;
    private TextView X5_3,X6_3,X7_3,X8_3,X9_3,X10_3,X11_3,X12_3,X13_3;
    private TextView X5_4,X6_4,X7_4,X8_4,X9_4,X10_4,X11_4,X12_4,X13_4;
    private TextView Det1,Det2,Det3,Det4;
    private Bundle Datos;

    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
        }
    };
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };

    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_paso1_4x4);
        mContentView = findViewById(R.id.fullscreen_content);
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
        Cofactor1 =  findViewById(R.id.Cofactor1);
        Cofactor2 =  findViewById(R.id.Cofactor2);
        Cofactor3 =  findViewById(R.id.Cofactor3);
        Cofactor4 =  findViewById(R.id.Cofactor4);
        findViewById(R.id.btnCol1).setOnClickListener(this);
        findViewById(R.id.btnCol2).setOnClickListener(this);
        findViewById(R.id.btnCol3).setOnClickListener(this);
        findViewById(R.id.btnCol4).setOnClickListener(this);
        findViewById(R.id.btnDet1).setOnClickListener(this);
        findViewById(R.id.btnDet2).setOnClickListener(this);
        findViewById(R.id.btnDet3).setOnClickListener(this);
        findViewById(R.id.btnDet4).setOnClickListener(this);
        X5_1 =  findViewById(R.id.X5_1);
        X5_2 =  findViewById(R.id.X5_2);
        X5_3 =  findViewById(R.id.X5_3);
        X5_4 =  findViewById(R.id.X5_4);
        X6_1 =  findViewById(R.id.X6_1);
        X6_2 =  findViewById(R.id.X6_2);
        X6_3 =  findViewById(R.id.X6_3);
        X6_4 =  findViewById(R.id.X6_4);
        X7_1 =  findViewById(R.id.X7_1);
        X7_2 =  findViewById(R.id.X7_2);
        X7_3 =  findViewById(R.id.X7_3);
        X7_4 =  findViewById(R.id.X7_4);
        X8_1 =  findViewById(R.id.X8_1);
        X8_2 =  findViewById(R.id.X8_2);
        X8_3 =  findViewById(R.id.X8_3);
        X8_4 =  findViewById(R.id.X8_4);
        X9_1 =  findViewById(R.id.X9_1);
        X9_2 =  findViewById(R.id.X9_2);
        X9_3 =  findViewById(R.id.X9_3);
        X9_4 =  findViewById(R.id.X9_4);
        X10_1 =  findViewById(R.id.X10_1);
        X10_2 =  findViewById(R.id.X10_2);
        X10_3 =  findViewById(R.id.X10_3);
        X10_4 =  findViewById(R.id.X10_4);
        X11_1 =  findViewById(R.id.X11_1);
        X11_2 =  findViewById(R.id.X11_2);
        X11_3 =  findViewById(R.id.X11_3);
        X11_4 =  findViewById(R.id.X11_4);
        X12_1 =  findViewById(R.id.X12_1);
        X12_2 =  findViewById(R.id.X12_2);
        X12_3 =  findViewById(R.id.X12_3);
        X12_4 =  findViewById(R.id.X12_4);
        X13_1 =  findViewById(R.id.X13_1);
        X13_2 =  findViewById(R.id.X13_2);
        X13_3 =  findViewById(R.id.X13_3);
        X13_4 =  findViewById(R.id.X13_4);
        Det1 = findViewById(R.id.Det1);
        Det2 = findViewById(R.id.Det2);
        Det3 = findViewById(R.id.Det3);
        Det4 = findViewById(R.id.Det4);
        findViewById(R.id.btnCol1).performClick();
    }

    private void Texto(String Det1, String Det2, String Det3, String Det4,
                       String Cofactor1, String Cofactor2, String Cofactor3, String Cofactor4,
                       String x5_1, String x6_1, String x7_1, String x8_1, String x9_1, String x10_1, String x11_1, String x12_1, String x13_1,
                       String x5_2, String x6_2, String x7_2, String x8_2, String x9_2, String x10_2, String x11_2, String x12_2, String x13_2,
                       String x5_3, String x6_3, String x7_3, String x8_3, String x9_3, String x10_3, String x11_3, String x12_3, String x13_3,
                       String x5_4, String x6_4, String x7_4, String x8_4, String x9_4, String x10_4, String x11_4, String x12_4, String x13_4){

        this.Det1.setText(Det1);
        this.Det2.setText(Det2);
        this.Det3.setText(Det3);
        this.Det4.setText(Det4);
        this.Cofactor1.setText(Cofactor1);
        this.Cofactor2.setText(Cofactor2);
        this.Cofactor3.setText(Cofactor3);
        this.Cofactor4.setText(Cofactor4);
        this.X5_1.setText(x5_1);
        this.X6_1.setText(x6_1);
        this.X7_1.setText(x7_1);
        this.X8_1.setText(x8_1);
        this.X9_1.setText(x9_1);
        this.X10_1.setText(x10_1);
        this.X11_1.setText(x11_1);
        this.X12_1.setText(x12_1);
        this.X13_1.setText(x13_1);
        this.X5_2.setText(x5_2);
        this.X6_2.setText(x6_2);
        this.X7_2.setText(x7_2);
        this.X8_2.setText(x8_2);
        this.X9_2.setText(x9_2);
        this.X10_2.setText(x10_2);
        this.X11_2.setText(x11_2);
        this.X12_2.setText(x12_2);
        this.X13_2.setText(x13_2);
        this.X5_3.setText(x5_3);
        this.X6_3.setText(x6_3);
        this.X7_3.setText(x7_3);
        this.X8_3.setText(x8_3);
        this.X9_3.setText(x9_3);
        this.X10_3.setText(x10_3);
        this.X11_3.setText(x11_3);
        this.X12_3.setText(x12_3);
        this.X13_3.setText(x13_3);
        this.X5_4.setText(x5_4);
        this.X6_4.setText(x6_4);
        this.X7_4.setText(x7_4);
        this.X8_4.setText(x8_4);
        this.X9_4.setText(x9_4);
        this.X10_4.setText(x10_4);
        this.X11_4.setText(x11_4);
        this.X12_4.setText(x12_4);
        this.X13_4.setText(x13_4);
    }

    private void TextoBoton(String Key){
        Texto(Datos.getDoubleArray(Key)[0]+ "", Datos.getDoubleArray(Key)[1]+ "", Datos.getDoubleArray(Key)[2]+ "", Datos.getDoubleArray(Key)[3]+ "",
                Datos.getDoubleArray(Key)[4]+ "", Datos.getDoubleArray(Key)[5]+ "", Datos.getDoubleArray(Key)[6]+ "", Datos.getDoubleArray(Key)[7]+ "",
                Datos.getDoubleArray(Key)[8]+ "", Datos.getDoubleArray(Key)[9]+ "", Datos.getDoubleArray(Key)[10]+ "", Datos.getDoubleArray(Key)[11]+ "",
                Datos.getDoubleArray(Key)[12]+ "", Datos.getDoubleArray(Key)[13]+ "", Datos.getDoubleArray(Key)[14]+ "", Datos.getDoubleArray(Key)[15]+ "", Datos.getDoubleArray(Key)[16]+ "",
                Datos.getDoubleArray(Key)[17]+ "", Datos.getDoubleArray(Key)[18]+ "", Datos.getDoubleArray(Key)[19]+ "", Datos.getDoubleArray(Key)[20]+ "", Datos.getDoubleArray(Key)[21]+ "",
                Datos.getDoubleArray(Key)[22]+ "", Datos.getDoubleArray(Key)[23]+ "", Datos.getDoubleArray(Key)[24]+ "", Datos.getDoubleArray(Key)[25]+ "",
                Datos.getDoubleArray(Key)[26]+ "", Datos.getDoubleArray(Key)[27]+ "", Datos.getDoubleArray(Key)[28]+ "", Datos.getDoubleArray(Key)[29]+ "", Datos.getDoubleArray(Key)[30]+ "",
                Datos.getDoubleArray(Key)[31]+ "", Datos.getDoubleArray(Key)[32]+ "", Datos.getDoubleArray(Key)[33]+ "", Datos.getDoubleArray(Key)[34]+ "", Datos.getDoubleArray(Key)[35]+ "",
                Datos.getDoubleArray(Key)[36]+ "", Datos.getDoubleArray(Key)[37]+ "", Datos.getDoubleArray(Key)[38]+ "", Datos.getDoubleArray(Key)[39]+ "",
                Datos.getDoubleArray(Key)[40]+ "", Datos.getDoubleArray(Key)[41]+ "", Datos.getDoubleArray(Key)[42]+ "", Datos.getDoubleArray(Key)[43]+ "");
    }

    private void Determinante(double x5, double x6, double x7, double x8, double x9, double x10, double x11, double x12, double x13){
        startActivity(new Intent(getApplicationContext(), Pasos3x3.class)
                .putExtra("x5", x5)
                .putExtra("x6", x6)
                .putExtra("x7", x7)
                .putExtra("x8", x8)
                .putExtra("x9", x9)
                .putExtra("x10", x10)
                .putExtra("x11", x11)
                .putExtra("x12", x12)
                .putExtra("x13", x13));
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        delayedHide(100);
    }

    private void hide() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }

    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
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
            case R.id.btnCol4:
                TextoBoton("Col4");
                Toast.makeText(getApplicationContext(), "Actualmente En La Columna 4", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDet1:
                Determinante(Double.parseDouble(X5_1.getText().toString()), Double.parseDouble(X6_1.getText().toString()), Double.parseDouble(X7_1.getText().toString()),
                             Double.parseDouble(X8_1.getText().toString()), Double.parseDouble(X9_1.getText().toString()), Double.parseDouble(X10_1.getText().toString()),
                             Double.parseDouble(X11_1.getText().toString()), Double.parseDouble(X12_1.getText().toString()), Double.parseDouble(X13_1.getText().toString()));
                break;
            case R.id.btnDet2:
                Determinante(Double.parseDouble(X5_2.getText().toString()), Double.parseDouble(X6_2.getText().toString()), Double.parseDouble(X7_2.getText().toString()),
                        Double.parseDouble(X8_2.getText().toString()), Double.parseDouble(X9_2.getText().toString()), Double.parseDouble(X10_2.getText().toString()),
                        Double.parseDouble(X11_2.getText().toString()), Double.parseDouble(X12_2.getText().toString()), Double.parseDouble(X13_2.getText().toString()));
                break;
            case R.id.btnDet3:
                Determinante(Double.parseDouble(X5_3.getText().toString()), Double.parseDouble(X6_3.getText().toString()), Double.parseDouble(X7_3.getText().toString()),
                        Double.parseDouble(X8_3.getText().toString()), Double.parseDouble(X9_3.getText().toString()), Double.parseDouble(X10_3.getText().toString()),
                        Double.parseDouble(X11_3.getText().toString()), Double.parseDouble(X12_3.getText().toString()), Double.parseDouble(X13_3.getText().toString()));
                break;
            case R.id.btnDet4:
                Determinante(Double.parseDouble(X5_4.getText().toString()), Double.parseDouble(X6_4.getText().toString()), Double.parseDouble(X7_4.getText().toString()),
                        Double.parseDouble(X8_4.getText().toString()), Double.parseDouble(X9_4.getText().toString()), Double.parseDouble(X10_4.getText().toString()),
                        Double.parseDouble(X11_4.getText().toString()), Double.parseDouble(X12_4.getText().toString()), Double.parseDouble(X13_4.getText().toString()));
                break;
        }
    }
}
