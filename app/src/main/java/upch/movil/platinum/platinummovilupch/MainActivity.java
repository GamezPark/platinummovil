package upch.movil.platinum.platinummovilupch;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.viewpagerindicator.TitlePageIndicator;
import rx.Observable;
import rx.Subscriber;
import upch.movil.platinum.platinummovilupch.adapter.Director_Adapter;

public class MainActivity extends AppCompatActivity {

    Director_Adapter tabAdapter;
    TitlePageIndicator titlePageIndicator;
    ViewPager viewPager;

    /*final Observable operationObservable = Observable.create(new Observable.OnSubscribe() {
        @Override
        public void call(Subscriber sub) {

        }
    });*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        titlePageIndicator = (TitlePageIndicator) findViewById(R.id.indicator);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabAdapter = new Director_Adapter(getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        titlePageIndicator.setViewPager(viewPager);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
