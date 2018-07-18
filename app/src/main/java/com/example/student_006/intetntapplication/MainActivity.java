package com.example.student_006.intetntapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSendMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendMsg = (Button) findViewById(R.id.buttonSend);
        EditText editMessage = (EditText) findViewById(R.id.editText_userMessage);

        final String msg = editMessage.getText().toString();

        btnSendMsg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                intent.putExtra("Message",msg);
                startActivity(intent);
            }
        });
    }
}
//    public void sendMessage(View view)
//    {
//        EditText editText_msg=(EditText) findViewById(R.id.editText_userMessage);
//        String msg=editText_msg.getText().toString();
//
//        Intent intent=new Intent(this,MessageActivity.class);
//        intent.putExtra("Extra_Message",msg);
//
//        startActivity(intent);
//    }
//}
