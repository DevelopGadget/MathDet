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

public class Adj_Pasos_4x4 extends AppCompatActivity implements View.OnClickListener{

    private TextView X14,X15,X16,X17,X18,X19,X20,X21,X22,X23,X24,X25,X26,X27,X28,X29;
    private TextView X14_1,X15_1,X16_1,X17_1,X18_1,X19_1,X20_1,X21_1,X22_1,X23_1,X24_1,X25_1,X26_1,X27_1,X28_1,X29_1;
    private InterstitialAd mInterstitialAd;
    private Bundle Cuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_pasos_4x4);
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
        findViewById(R.id.Paso1).setOnClickListener(this);
        findViewById(R.id.Paso2).setOnClickListener(this);
        Instancias();
        Cuatro = getIntent().getExtras();
        Texto();
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
        X14.setText(""+Cuatro.getDouble("x14"));
        X15.setText(""+Cuatro.getDouble("x15"));
        X16.setText(""+Cuatro.getDouble("x16"));
        X17.setText(""+Cuatro.getDouble("x17"));
        X18.setText(""+Cuatro.getDouble("x18"));
        X19.setText(""+Cuatro.getDouble("x19"));
        X20.setText(""+Cuatro.getDouble("x20"));
        X21.setText(""+Cuatro.getDouble("x21"));
        X22.setText(""+Cuatro.getDouble("x22"));
        X23.setText(""+Cuatro.getDouble("x23"));
        X24.setText(""+Cuatro.getDouble("x24"));
        X25.setText(""+Cuatro.getDouble("x25"));
        X26.setText(""+Cuatro.getDouble("x26"));
        X27.setText(""+Cuatro.getDouble("x27"));
        X28.setText(""+Cuatro.getDouble("x28"));
        X29.setText(""+Cuatro.getDouble("x29"));
        X14_1.setText(Cofactor(1, Cuatro.getDouble("x19"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"),
                Cuatro.getDouble("x23"), Cuatro.getDouble("x24"), Cuatro.getDouble("x25"), Cuatro.getDouble("x27"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X15_1.setText(Cofactor(-1, Cuatro.getDouble("x15"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x23"), Cuatro.getDouble("x24"), Cuatro.getDouble("x25"), Cuatro.getDouble("x27"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X16_1.setText(Cofactor(1, Cuatro.getDouble("x15"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x19"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"), Cuatro.getDouble("x27"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X17_1.setText(Cofactor(-1, Cuatro.getDouble("x15"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x19"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"), Cuatro.getDouble("x23"),
                Cuatro.getDouble("x24"), Cuatro.getDouble("x25")) + "");
        X18_1.setText(Cofactor(-1, Cuatro.getDouble("x18"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x24"), Cuatro.getDouble("x25"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X19_1.setText(Cofactor(1, Cuatro.getDouble("x14"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x24"), Cuatro.getDouble("x25"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X20_1.setText(Cofactor(-1, Cuatro.getDouble("x14"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x28"), Cuatro.getDouble("x29")) + "");
        X21_1.setText(Cofactor(1, Cuatro.getDouble("x14"), Cuatro.getDouble("x16"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x20"), Cuatro.getDouble("x21"), Cuatro.getDouble("x22"),
                Cuatro.getDouble("x24"), Cuatro.getDouble("x25")) + "");
        X22_1.setText(Cofactor(1, Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x21"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x23"), Cuatro.getDouble("x25"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x29")) + "");
        X23_1.setText(Cofactor(-1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x23"), Cuatro.getDouble("x25"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x29")) + "");
        X24_1.setText(Cofactor(1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x21"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x29")) + "");
        X25_1.setText(Cofactor(-1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x17"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x21"), Cuatro.getDouble("x22"),
                Cuatro.getDouble("x23"), Cuatro.getDouble("x25")) + "");
        X26_1.setText(Cofactor(-1, Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x20"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x23"), Cuatro.getDouble("x24"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x28")) + "");
        X27_1.setText(Cofactor(1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x16"),
                Cuatro.getDouble("x22"), Cuatro.getDouble("x23"), Cuatro.getDouble("x24"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x28")) + "");
        X28_1.setText(Cofactor(-1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x16"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x20"), Cuatro.getDouble("x26"),
                Cuatro.getDouble("x27"), Cuatro.getDouble("x28")) + "");
        X29_1.setText(Cofactor(1, Cuatro.getDouble("x14"), Cuatro.getDouble("x15"), Cuatro.getDouble("x16"),
                Cuatro.getDouble("x18"), Cuatro.getDouble("x19"), Cuatro.getDouble("x20"), Cuatro.getDouble("x22"),
                Cuatro.getDouble("x23"), Cuatro.getDouble("x24")) + "");
    }

    private double Cofactor(int cofactor, double x5, double x6, double x7, double x8, double x9, double x10, double x11, double x12, double x13){
            return cofactor * ((x5 * x9 * x13 + x8 * x12 * x7 + x11 * x6 * x10) - (x8 * x6 * x13 + x5 * x12 * x10 + x11 * x9 * x7));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Paso1:
                startActivity(new Intent(getApplicationContext(), Adj_Paso1_4x4.class)
                .putExtra("Col1", new double[]{Double.parseDouble(X14_1.getText().toString()), Double.parseDouble(X15_1.getText().toString()), Double.parseDouble(X16_1.getText().toString()), Double.parseDouble(X17_1.getText().toString()),
                            1, -1, 1, -1,
                            Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                            Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                            Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                            Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25")})

                .putExtra("Col2", new double[]{Double.parseDouble(X18_1.getText().toString()), Double.parseDouble(X19_1.getText().toString()), Double.parseDouble(X20_1.getText().toString()), Double.parseDouble(X21_1.getText().toString()),
                    -1, 1, -1, 1,
                    Cuatro.getDouble("x18"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x22"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25"),Cuatro.getDouble("x26"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                    Cuatro.getDouble("x14"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x22"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25"),Cuatro.getDouble("x26"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                    Cuatro.getDouble("x14"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x18"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x26"),Cuatro.getDouble("x28"),Cuatro.getDouble("x29"),
                    Cuatro.getDouble("x14"),Cuatro.getDouble("x16"),Cuatro.getDouble("x17"),Cuatro.getDouble("x18"),Cuatro.getDouble("x20"),Cuatro.getDouble("x21"),Cuatro.getDouble("x22"),Cuatro.getDouble("x24"),Cuatro.getDouble("x25")})

                .putExtra("Col3", new double[]{Double.parseDouble(X22_1.getText().toString()), Double.parseDouble(X23_1.getText().toString()), Double.parseDouble(X24_1.getText().toString()), Double.parseDouble(X25_1.getText().toString()),
                        1, -1, 1, -1,
                        Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x21"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x25"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x29"),
                        Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x17"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x25"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x29"),
                        Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x17"),Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x21"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x29"),
                        Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x17"),Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x21"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x25")})

                .putExtra("Col4", new double[]{Double.parseDouble(X26_1.getText().toString()), Double.parseDouble(X27_1.getText().toString()), Double.parseDouble(X28_1.getText().toString()), Double.parseDouble(X29_1.getText().toString()),
                        -1, 1, -1, 1,
                           Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),
                           Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),
                           Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x26"),Cuatro.getDouble("x27"),Cuatro.getDouble("x28"),
                           Cuatro.getDouble("x14"),Cuatro.getDouble("x15"),Cuatro.getDouble("x16"),Cuatro.getDouble("x18"),Cuatro.getDouble("x19"),Cuatro.getDouble("x20"),Cuatro.getDouble("x22"),Cuatro.getDouble("x23"),Cuatro.getDouble("x24")}));
                break;

            case R.id.Paso2:
                startActivity(new Intent(getApplicationContext(), Adj_Paso2_4x4.class)
                .putExtra("x14", X14_1.getText().toString())
                .putExtra("x15", X15_1.getText().toString())
                .putExtra("x16", X16_1.getText().toString())
                .putExtra("x17", X17_1.getText().toString())
                .putExtra("x18", X18_1.getText().toString())
                .putExtra("x19", X19_1.getText().toString())
                .putExtra("x20", X20_1.getText().toString())
                .putExtra("x21", X21_1.getText().toString())
                .putExtra("x22", X22_1.getText().toString())
                .putExtra("x23", X23_1.getText().toString())
                .putExtra("x24", X24_1.getText().toString())
                .putExtra("x25", X25_1.getText().toString())
                .putExtra("x26", X26_1.getText().toString())
                .putExtra("x27", X27_1.getText().toString())
                .putExtra("x28", X28_1.getText().toString())
                .putExtra("x29", X29_1.getText().toString()));
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
