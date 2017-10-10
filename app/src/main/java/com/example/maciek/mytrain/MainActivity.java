package com.example.maciek.mytrain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] connections={
                "Warszawa- Sochaczew",
                "Sochaczew-Warszawa",
                "Wrocław-Poznań"
        };

        ArrayAdapter<String> connectionAdapter=new ArrayAdapter<String>(this, R.layout.connection_item, R.id.connection_label, connections);
        ListView connectionsView=new ListView(this);
        connectionsView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, ConnectionActivity.class);
                startActivity(intent);
            }
        });
        setContentView(connectionsView);
        connectionsView.setAdapter(connectionAdapter);
    }
}
