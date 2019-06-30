package com.devpro.databaseandfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";// phim tat: logt

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragment(Fragment01.newInstance());
    }


    public void getFragment(Fragment fragment){
        try{
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
        }
        catch (Exception e){
            e.printStackTrace();
            Log.d(TAG, "getFragment: " +e.getMessage());

        }

    }
}
