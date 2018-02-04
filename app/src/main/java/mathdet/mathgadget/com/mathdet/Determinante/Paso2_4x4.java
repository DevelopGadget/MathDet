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

public class Paso2_4x4 extends AppCompatActivity implements View.OnClickListener{

    private TextView Cofactor1,Cofactor2,Cofactor3,Cofactor4;
    private TextView X5_1,X6_1,X7_1,X8_1,X9_1,X10_1,X11_1,X12_1,X13_1;
    private TextView X5_2,X6_2,X7_2,X8_2,X9_2,X10_2,X11_2,X12_2,X13_2;
    private TextView X5_3,X6_3,X7_3,X8_3,X9_3,X10_3,X11_3,X12_3,X13_3;
    private TextView X5_4,X6_4,X7_4,X8_4,X9_4,X10_4,X11_4,X12_4,X13_4;
    private TextView Det1,Det2,Det3,Det4;
    private Bundle A;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paso2_4x4);
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
        Texto();
    }
    private void Intancias(){
        Cofactor1 =  findViewById(R.id.Cofactor1);
        Cofactor2 =  findViewById(R.id.Cofactor2);
        Cofactor3 =  findViewById(R.id.Cofactor3);
        Cofactor4 =  findViewById(R.id.Cofactor4);
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
        Det1 =  findViewById(R.id.Det1);
        Det2 =  findViewById(R.id.Det2);
        Det3 =  findViewById(R.id.Det3);
        Det4 =  findViewById(R.id.Det4);
        findViewById(R.id.btnDet1).setOnClickListener(this);
        findViewById(R.id.btnDet2).setOnClickListener(this);
        findViewById(R.id.btnDet3).setOnClickListener(this);
        findViewById(R.id.btnDet4).setOnClickListener(this);
    }

    private void Texto(){

        A = getIntent().getExtras();
        Cofactor1.setText("(1) (" + A.getBundle("var").getDouble("x14") + " )");
        Cofactor2.setText("(-1) (" + A.getBundle("var").getDouble("x15") + " )");
        Cofactor3.setText("(1) (" + A.getBundle("var").getDouble("x16") + " )");
        Cofactor4.setText("(-1) (" + A.getBundle("var").getDouble("x17") + " )");
        X5_1.setText("" + A.getBundle("var").getDouble("x19"));
        X6_1.setText("" + A.getBundle("var").getDouble("x20"));
        X7_1.setText("" + A.getBundle("var").getDouble("x21"));
        X8_1.setText("" + A.getBundle("var").getDouble("x23"));
        X9_1.setText("" + A.getBundle("var").getDouble("x24"));
        X10_1.setText("" + A.getBundle("var").getDouble("x25"));
        X11_1.setText("" + A.getBundle("var").getDouble("x27"));
        X12_1.setText("" + A.getBundle("var").getDouble("x28"));
        X13_1.setText("" + A.getBundle("var").getDouble("x29"));
        X5_2.setText("" + A.getBundle("var").getDouble("x18"));
        X6_2.setText("" + A.getBundle("var").getDouble("x20"));
        X7_2.setText("" + A.getBundle("var").getDouble("x21"));
        X8_2.setText("" + A.getBundle("var").getDouble("x22"));
        X9_2.setText("" + A.getBundle("var").getDouble("x24"));
        X10_2.setText("" + A.getBundle("var").getDouble("x25"));
        X11_2.setText("" + A.getBundle("var").getDouble("x26"));
        X12_2.setText("" + A.getBundle("var").getDouble("x28"));
        X13_2.setText("" + A.getBundle("var").getDouble("x29"));
        X5_3.setText("" + A.getBundle("var").getDouble("x18"));
        X6_3.setText("" + A.getBundle("var").getDouble("x19"));
        X7_3.setText("" + A.getBundle("var").getDouble("x21"));
        X8_3.setText("" + A.getBundle("var").getDouble("x22"));
        X9_3.setText("" + A.getBundle("var").getDouble("x23"));
        X10_3.setText("" + A.getBundle("var").getDouble("x25"));
        X11_3.setText("" + A.getBundle("var").getDouble("x26"));
        X12_3.setText("" + A.getBundle("var").getDouble("x27"));
        X13_3.setText("" + A.getBundle("var").getDouble("x29"));
        X5_4.setText("" + A.getBundle("var").getDouble("x18"));
        X6_4.setText("" + A.getBundle("var").getDouble("x19"));
        X7_4.setText("" + A.getBundle("var").getDouble("x20"));
        X8_4.setText("" + A.getBundle("var").getDouble("x22"));
        X9_4.setText("" + A.getBundle("var").getDouble("x23"));
        X10_4.setText("" + A.getBundle("var").getDouble("x24"));
        X11_4.setText("" + A.getBundle("var").getDouble("x26"));
        X12_4.setText("" + A.getBundle("var").getDouble("x27"));
        X13_4.setText("" + A.getBundle("var").getDouble("x28"));
        Det1.setText("= " + A.getDouble("Det1"));
        Det2.setText("= " + A.getDouble("Det2"));
        Det3.setText("= " + A.getDouble("Det3"));
        Det4.setText("= " + A.getDouble("Det4"));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnDet1:
                Det1();
                break;
            case R.id.btnDet2:
                Det2();
                break;
            case R.id.btnDet3:
                Det3();
                break;
            case R.id.btnDet4:
                Det4();
                break;
        }

    }
    private void Det1(){
        A = getIntent().getExtras();
        Intent i = new Intent(getApplicationContext(), Pasos3x3.class);
        i.putExtra("x5", A.getBundle("var").getDouble("x19"));
        i.putExtra("x6", A.getBundle("var").getDouble("x20"));
        i.putExtra("x7", A.getBundle("var").getDouble("x21"));
        i.putExtra("x8", A.getBundle("var").getDouble("x23"));
        i.putExtra("x9", A.getBundle("var").getDouble("x24"));
        i.putExtra("x10", A.getBundle("var").getDouble("x25"));
        i.putExtra("x11", A.getBundle("var").getDouble("x27"));
        i.putExtra("x12", A.getBundle("var").getDouble("x28"));
        i.putExtra("x13", A.getBundle("var").getDouble("x29"));
        i.putExtra("Determinante", (A.getDouble("Det1") / A.getBundle("var").getDouble("x14")));
        i.putExtra("Part1", A.getDouble("Parte1Det1"));
        i.putExtra("Part2", A.getDouble("Parte2Det1"));
        startActivity(i);
    }
    private void Det2(){
        A = getIntent().getExtras();
        Intent i = new Intent(getApplicationContext(), Pasos3x3.class);
        i.putExtra("x5", A.getBundle("var").getDouble("x18"));
        i.putExtra("x6", A.getBundle("var").getDouble("x20"));
        i.putExtra("x7", A.getBundle("var").getDouble("x21"));
        i.putExtra("x8", A.getBundle("var").getDouble("x22"));
        i.putExtra("x9", A.getBundle("var").getDouble("x24"));
        i.putExtra("x10", A.getBundle("var").getDouble("x25"));
        i.putExtra("x11", A.getBundle("var").getDouble("x26"));
        i.putExtra("x12", A.getBundle("var").getDouble("x28"));
        i.putExtra("x13", A.getBundle("var").getDouble("x29"));
        i.putExtra("Determinante", (A.getDouble("Det2") / -A.getBundle("var").getDouble("x15")));
        i.putExtra("Part1", A.getDouble("Parte1Det2"));
        i.putExtra("Part2", A.getDouble("Parte2Det2"));
        startActivity(i);
    }
    private void Det3(){
        A = getIntent().getExtras();
        Intent i = new Intent(getApplicationContext(), Pasos3x3.class);
        i.putExtra("x5", A.getBundle("var").getDouble("x18"));
        i.putExtra("x6", A.getBundle("var").getDouble("x19"));
        i.putExtra("x7", A.getBundle("var").getDouble("x21"));
        i.putExtra("x8", A.getBundle("var").getDouble("x22"));
        i.putExtra("x9", A.getBundle("var").getDouble("x23"));
        i.putExtra("x10", A.getBundle("var").getDouble("x25"));
        i.putExtra("x11", A.getBundle("var").getDouble("x26"));
        i.putExtra("x12", A.getBundle("var").getDouble("x27"));
        i.putExtra("x13", A.getBundle("var").getDouble("x29"));
        i.putExtra("Determinante", (A.getDouble("Det3") / A.getBundle("var").getDouble("x16")));
        i.putExtra("Part1", A.getDouble("Parte1Det3"));
        i.putExtra("Part2", A.getDouble("Parte2Det3"));
        startActivity(i);
    }
    private void Det4(){
        A = getIntent().getExtras();
        Intent i = new Intent(getApplicationContext(), Pasos3x3.class);
        i.putExtra("x5", A.getBundle("var").getDouble("x18"));
        i.putExtra("x6", A.getBundle("var").getDouble("x19"));
        i.putExtra("x7", A.getBundle("var").getDouble("x20"));
        i.putExtra("x8", A.getBundle("var").getDouble("x22"));
        i.putExtra("x9", A.getBundle("var").getDouble("x23"));
        i.putExtra("x10", A.getBundle("var").getDouble("x24"));
        i.putExtra("x11", A.getBundle("var").getDouble("x26"));
        i.putExtra("x12", A.getBundle("var").getDouble("x27"));
        i.putExtra("x13", A.getBundle("var").getDouble("x28"));
        i.putExtra("Determinante", (A.getDouble("Det4") / -A.getBundle("var").getDouble("x17")));
        i.putExtra("Part1", A.getDouble("Parte1Det4"));
        i.putExtra("Part2", A.getDouble("Parte2Det4"));
        startActivity(i);
    }
}
