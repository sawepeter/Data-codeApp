package com.sawepeter.loan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;
    private static final int MY_PERMISSION_STORAGE = 1;

    TextView barcode;
    Button scan;
    ImageView codeimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barcode = (TextView)findViewById(R.id.textview);
        scan = (Button)findViewById(R.id.button);
        codeimage = (ImageView)findViewById(R.id.imageView);
    }
}
