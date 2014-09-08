package com.example.ericjohns.elec3850_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Activity_Main extends Activity implements View.OnClickListener
{

    Button button2_1;
    Button button2_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity__main);
        button2_1 = (Button)findViewById(R.id.button2_1);
        button2_1.setOnClickListener(this);
        button2_2 = (Button)findViewById(R.id.button2_2);
        button2_2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity__main, menu);
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
    private void button2_1Click()
    {
        startActivity(new Intent("elec3850_1.View_Devices"));
    }
    private void button2_2Click()
    {
        startActivity(new Intent("elec3850_1.Power_Usage"));
    }
    @Override
    public void onClick(View v) {
    switch(v.getId())
    {
        case R.id.button2_1:
            button2_1Click();
            break;
        case R.id.button2_2:
            button2_2Click();
            break;
    }
    }
}
