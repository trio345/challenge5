package id.co.mdd.shrine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToFirstActivity(View view) {
        startActivity(new Intent(this, FirstActivity.class));

    }

    public void moveToSecondActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void moveToThirdActivity(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }
}