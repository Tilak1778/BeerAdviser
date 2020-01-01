package tluck.raj.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView BeerType =findViewById(R.id.textView);

        Button getAdvise =findViewById(R.id.ButtonGetAdvise);

    }

    private beerExpert expert=new beerExpert();



    public void getBeerAdvise(View view){
        Spinner color =findViewById(R.id.colour);
        TextView BeerType =findViewById(R.id.textView);

        String beerColor= color.getSelectedItem().toString();

        List<String> brandsList =expert.getBrands(beerColor);

        StringBuilder brands =new StringBuilder();

        for(String b:brandsList){

            brands.append(b).append('\n');

        }

        String msg=brands.toString();
       Intent intent=new Intent(Intent.ACTION_SEND);
       intent.setType("text/plain");
       intent.putExtra(Intent.EXTRA_TEXT,msg);

       Intent chooseIntent= Intent.createChooser(intent,"Send");


       startActivity(chooseIntent);



    }

}
