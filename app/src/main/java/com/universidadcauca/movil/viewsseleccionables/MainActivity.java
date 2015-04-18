package com.universidadcauca.movil.viewsseleccionables;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    ListView list;
    String colores[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= (ListView) findViewById(R.id.list);
        list.setOnItemClickListener(this);

        colores = getResources().getStringArray(R.array.colores);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String msg = getString(R.string.notificacion_color)+colores[position];
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
