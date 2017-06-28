package namantiwari.programminginterviewquestions;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CSS extends AppCompatActivity {

    LinearLayout lay;

    public final static String SITE1_KEY="site1.site1_key";
    public final static String SITE2_KEY = "site2.site2_key";
    TextView codes,out1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String site2 = intent.getStringExtra(SITE1_KEY);
        String site3 = intent.getStringExtra(SITE2_KEY);


        
        setContentView(R.layout.activity_css);


        lay = (LinearLayout)findViewById(R.id.layout);

        out1=(TextView)findViewById(R.id.name);
        out1.setText(site3);

        codes =(TextView)findViewById(R.id.data);
        codes.setText(site2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.code, menu);
        return true;
    }

    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {



        switch (item.getItemId())
        {


            case R.id.mode:

                Toast.makeText(getBaseContext(), "Night Mode Activated", Toast.LENGTH_SHORT).show();
                  lay.setBackgroundResource(R.drawable.night);

                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
