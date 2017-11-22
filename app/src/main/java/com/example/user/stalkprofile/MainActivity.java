package com.example.user.stalkprofile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Stalk Profile");

        final EditText name = findViewById(R.id.editText);
        final EditText pw = findViewById(R.id.editText2);
        Button bt = findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String profileName = name.getText().toString();
                String val = pw.getText().toString();
                int sID = Integer.parseInt(val);

                if((profileName.equals("Muntaka") && sID == 1605106) || (profileName.equals("Tasnim") && sID == 1605102) || (profileName.equals("Adiba") && sID == 1605097) || (profileName.equals("Swapnil") && sID == 1605007)){
                    Intent MyIntent = new Intent(MainActivity.this, SecondActivity.class);
                    MyIntent.putExtra("Name", profileName);
                    startActivity(MyIntent);
                }
                else if(profileName.equals("") || val.equals("")){
                    Toast.makeText(getApplicationContext(), "Enter Username/Password", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
          //  return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
