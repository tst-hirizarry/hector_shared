package com.example.rubenexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    private static final String LOGIN = "com.example.rubenexample.LOGIN";


	@Override
    protected void onCreate(Bundle savedInstanceState) {
       if(!SessionManager.getInst().isAuth()){
    	   Intent i=new Intent();
    	   //i.setAction(LOGIN);
    	   i.setComponent(new ComponentName("com.example.rubenexample", "com.example.rubenexample.LoginActivity"));
    	   i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS|Intent.FLAG_ACTIVITY_CLEAR_TOP);
    	   startActivity(i,new Bundle());
    	   this.finish();
       }
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
