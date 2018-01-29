package com.pramudana.sam.gridviewwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String nameList[] = {

            "Facebook", "Instagram", "Line", "Path", "Tik Tok", "Whatsapp"
    };

    int iconList[] = {

           R.drawable.fb_icon, R.drawable.instagram_icon, R.drawable.line_icon, R.drawable.path_icon,
            R.drawable.tiktok_icon, R.drawable.whatsapp_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        GridAdapter adapter = new GridAdapter(MainActivity.this, iconList, nameList);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Clicked Letter :" + nameList[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
