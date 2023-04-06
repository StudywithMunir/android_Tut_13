package com.example.android_tut_13;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MyMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_menu);

    }

    //menu is menu variable
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.firstmenu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

           case R.id.aboutUs:

            Toast.makeText(MyMenuActivity.this,"About Us",  Toast.LENGTH_LONG).show();

            break;

          case R.id.contactUs:

            Toast.makeText(MyMenuActivity.this,"Contact Us",  Toast.LENGTH_LONG).show();

            break;

            case R.id.submenu:

                Toast.makeText(MyMenuActivity.this,"Sub Menu",  Toast.LENGTH_LONG).show();

                break;

        }

        return false;

    }
}
