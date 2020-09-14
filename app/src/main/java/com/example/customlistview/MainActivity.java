package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TextView textView;
    private int[] images = {R.drawable.test,R.drawable.test,R.drawable.test};
    private String[] Desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        //Title = getResources().getStringArray(R.array.title);

        List<String> Title = new ArrayList<String>();

        Title.add("Android");
        Title.add("Java");


        CustomAdapter adapter = new CustomAdapter(this,Title,images);
        listView.setAdapter(adapter);





    }
}