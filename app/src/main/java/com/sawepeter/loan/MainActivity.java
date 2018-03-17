package com.sawepeter.loan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;
    private static final int MY_PERMISSION_STORAGE = 1;

    TextView barcode;
    Button scan;
    ImageView codeimage;

    BarcodeDetector detector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcode = (TextView)findViewById(R.id.textview);
        scan = (Button)findViewById(R.id.button);
        codeimage = (ImageView)findViewById(R.id.imageView);

        //intial detector
        detector = new BarcodeDetector.Builder(getApplicationContext())
                .setBarcodeFormats(Barcode.DATA_MATRIX | Barcode.QR_CODE).build();
        if(!detector.isOperational()){
            barcode.setText("Could not set up detector");
        }
      
    }
}
