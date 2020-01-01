package tluck.raj.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent intent=getIntent();

        TextView Tv_Receive=findViewById(R.id.TextView_Receive);
        String msg=intent.getStringExtra("message");
        Tv_Receive.setText(msg);




    }
}
