package voy.bert.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.etsy.android.grid.StaggeredGridView;

import java.util.ArrayList;
import java.util.List;

import voy.bert.adaptadores.ListaPpalAdapterStagg;


public class Activity_Ppal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__ppal);


        List<String> aux = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            String contacto = "";
            for (int j = 0; j < i % 4; j++) {
                contacto += "Contacto \n";
            }
            aux.add(contacto + "Contacto" + i);
        }

        ListaPpalAdapterStagg adapterStagg = new ListaPpalAdapterStagg(this, aux);

        StaggeredGridView staggeredGridView = (StaggeredGridView) findViewById(R.id.grid_view);

        staggeredGridView.setAdapter(adapterStagg);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity__ppal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
