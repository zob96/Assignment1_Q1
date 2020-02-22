package com.example.smd_assign1_q1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView mycard2= findViewById(R.id.profile_cardview_3);



    mycard2.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {

            Intent x= new Intent(getApplicationContext(), JobDescription.class);
            startActivity(x);

        }
    });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.tool_searchmenu, menu);
        MenuItem menuItem=  menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) menuItem.getActionView();

        searchView.setQueryHint("Search jobs");

        return super.onCreateOptionsMenu(menu);
    }
}

