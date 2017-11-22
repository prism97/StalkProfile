package com.example.user.stalkprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Stalk Profile");

        Intent MyIntent = getIntent();
        String name = MyIntent.getStringExtra("Name");

        TextView textView = findViewById(R.id.textView);
        textView.setText(name);
        ImageView imageView = findViewById(R.id.imageView);
        switch (name){
            case "Muntaka" : imageView.setImageDrawable(getDrawable(R.drawable.munu)); break;
            case "Tasnim" :  imageView.setImageDrawable(getDrawable(R.drawable.nis)); break;
            case "Adiba" :  imageView.setImageDrawable(getDrawable(R.drawable.ade)); break;
            case "Swapnil" : imageView.setImageDrawable(getDrawable(R.drawable.mama)); break;
            default: break;
        }

        TextView multiline = findViewById(R.id.editText3);
        switch (name){
            case "Muntaka" : multiline.setText(R.string.munu); break;
            case "Tasnim" : multiline.setText(R.string.nis); break;
            case "Adiba" : multiline.setText(R.string.ade); break;
            case "Swapnil" : multiline.setText(R.string.mama); break;
            default: break;
        }

        Button lout = findViewById(R.id.button2);
        lout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

    }

    public void onBackPressed(){

    }

}
