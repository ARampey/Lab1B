package com.example.lab1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {


    //messageList & usedList
    //rand = new Random();

    ArrayList<String> messageList = new ArrayList<String>();
    ArrayList<String> usedList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        messageList.add("you get knocked out");
        messageList.add("you go somewhere else");
        messageList.add("you find a dead man");
        messageList.add("you find a frayed rope");
        messageList.add("a bullet whizzes past your ear!");
        messageList.add("you are almost run over");
        messageList.add("you are being followed");
        messageList.add("you smell familiar perfume");
        messageList.add("the telephone rings");
        messageList.add("there is a knock at the door");
        messageList.add("you find a dead woman");
        messageList.add("you meet a buxom blonde");
        messageList.add("someone has searched the place");
        messageList.add("a crooked cop warns you");
        messageList.add("you are arrested");
        messageList.add("you find a gun");
        messageList.add("you find a knife");
        messageList.add("you hear footsteps behind you ...");
        messageList.add("you hear a gunshot!");
        messageList.add("you hear a scream!");
        messageList.add("you are not alone ...");
        messageList.add("... forget this story, it stinks!");
    }

    public void helpButtonClicked(View v) {
        Random rand = new Random();
        int index = rand.nextInt(messageList.size());
        TextView t = (TextView) findViewById(R.id.helpMessage);
        t.setText(messageList.get(index));
        usedList.add(messageList.get(index));
        messageList.remove(index);

        if(messageList.size() == 0) {
            messageList.addAll(usedList);
            usedList = new ArrayList<String>();
        }
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
