package com.example.student_006.intetntapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent = getIntent();

        String message = intent.getStringExtra("Message");

        TextView textView = (TextView) findViewById(R.id.textViewDisplayMessage);

        textView.setText(message);

    }

    public void openFinal(View view) {

        startActivity( new Intent(MessageActivity.this,FinalActivity.class));
    }
}