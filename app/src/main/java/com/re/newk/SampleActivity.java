package com.re.newk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SampleActivity extends AppCompatActivity {
private static String URL_JSON = "https://simplifiedcoding.net/demos/view-flipper/heroes.php";
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
}
