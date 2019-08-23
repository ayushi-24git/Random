package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button vidbut;
    private Button gamebut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebView myWebView = new WebView(this);
        vidbut= findViewById(R.id.videobutton);
        vidbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Uri uri = Uri.parse("http://todlearning.com/mytodlers/bee.mp4"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });
        gamebut= findViewById(R.id.mazebutton);
        gamebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, gameview.class);
                startActivity(i);
                MainActivity.this.finish();
                System.out.println("helloayu1");


            }
        });
    }
}
