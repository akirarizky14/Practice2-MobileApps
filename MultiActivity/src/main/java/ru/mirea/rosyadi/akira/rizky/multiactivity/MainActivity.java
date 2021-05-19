package ru.mirea.rosyadi.akira.rizky.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNewActivity(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", "MIREA - Рошади Акира Ризкй СТУДЕНТА");
        startActivity(intent);
        // У второй активности
        String text = (String) getIntent().getSerializableExtra("key");
    }
}