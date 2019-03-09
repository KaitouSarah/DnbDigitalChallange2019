package dat153.no.digitalbolighandel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_bidding(View view) {
        Intent startNewActivity = new Intent(this, BiddingActivity.class);
        startActivity(startNewActivity);
    }
}
