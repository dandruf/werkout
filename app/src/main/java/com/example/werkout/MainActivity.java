package com.example.werkout;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import javax.annotation.ParametersAreNonnullByDefault;

import io.realm.Realm;
import io.realm.mongodb.App;
import io.realm.mongodb.AppConfiguration;
import io.realm.mongodb.Credentials;
import io.realm.mongodb.User;
import io.realm.mongodb.sync.SyncConfiguration;

public class MainActivity extends AppCompatActivity {
    static User user;
    static Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Realm.init(this); // context, usually an Activity or Application
        String appID = "werkout-qkpbh"; // replace this with your App ID
        App app = new App(new AppConfiguration.Builder(appID)
                .build());


        Credentials credentials = Credentials.anonymous();

        app.loginAsync(credentials, it -> {
            if (it.isSuccess()) {
                Log.v("QUICKSTART", "Successfully authenticated anonymously.");

                user = app.currentUser();

                String partitionValue = "myPartition";
                SyncConfiguration config = new SyncConfiguration.Builder(user, partitionValue)
                        .waitForInitialRemoteData()
                        .build();

                // Sync all realm changes via a new instance, and when that instance has been successfully created connect it to an on-screen list (a recycler view)
                Realm.getInstanceAsync(config, new Realm.Callback() {
                    @Override
                    @ParametersAreNonnullByDefault
                    public void onSuccess(Realm _realm) {
                        // since this realm should live exactly as long as this activity, assign the realm to a member variable
                        realm = _realm;
                        Log.v("QUICKSTART", "Successfully instantiated realm!");
                    }
                });

                user.logOutAsync(result -> {
                    if (result.isSuccess()) {
                        Log.v("QUICKSTART", "Successfully logged out.");
                    } else {
                        Log.e("QUICKSTART", result.getError().toString());
                    }
                });
            } else {
                Log.e("QUICKSTART", it.getError().toString());
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}