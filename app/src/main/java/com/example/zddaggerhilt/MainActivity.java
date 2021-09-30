package com.example.zddaggerhilt;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.zddaggerhilt.api.ZdDataRepository;
import com.example.zddaggerhilt.databinding.ActivityMainBinding;
import com.example.zddaggerhilt.di.Address;
import com.example.zddaggerhilt.di.User;
import com.google.android.material.snackbar.Snackbar;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    @Inject
    User user;
    @Inject
    User user2;

    @Inject
    Address address;
    @Inject
    Address address2;

    @Inject
    ZdDataRepository dataRepository;
    @Inject
    ZdDataRepository dataRepository2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((ZdApp) getApplication()).appComponent.actFactory().create().inject(this);
        super.onCreate(savedInstanceState);
        Log.i("ZdTest", "user:" + user);
        Log.i("ZdTest", "user:" + user2);
        Log.i("ZdTest", "address:" + address);
        Log.i("ZdTest", "address2:" + address2);
        Log.i("ZdTest", "main dataRepository:" + dataRepository);
        Log.i("ZdTest", "main dataRepository2:" + dataRepository2);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}