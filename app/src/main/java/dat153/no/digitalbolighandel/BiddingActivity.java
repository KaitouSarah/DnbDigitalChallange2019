package dat153.no.digitalbolighandel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BiddingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidding);

        CardView cardView=findViewById(R.id.biddingSession0);
        System.out.println(cardView);
        cardView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(getApplicationContext(),BiddingRoundActivity.class);
                startActivity(intent);
            }
        });
    }

    public void biddingBackButton(View view) {
        Intent goToPreviousActivity = new Intent(this, MainActivity.class);
        startActivity(goToPreviousActivity);
    }
}
