package com.ccaglayan1985.masadansiparis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MasadanSiparis extends AppCompatActivity {

   TextView metin_alani;
   Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masadan_siparis);

       metin_alani= (TextView) findViewById(R.id.tv);
       btn= (Button) findViewById(R.id.button);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               
           }
       });
    }
}
