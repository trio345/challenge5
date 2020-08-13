package id.co.mdd.shrine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Shipping Address");
        }
    }
}