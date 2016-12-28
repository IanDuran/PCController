package com.example.usuario.pccontroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;
    private EditText textMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textMessage = (EditText)findViewById(R.id.txt_message);
        buttonSend = (Button)findViewById(R.id.button_send);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = textMessage.getText().toString();
                if(!message.equals("")){
                    Communicator c = new Communicator();
                    c.send(message);
                    Toast.makeText(MainActivity.this, R.string.sent_confirmation, Toast.LENGTH_SHORT).show();
                    textMessage.setText(null);
                }else{
                    Toast.makeText(MainActivity.this, R.string.missing_fields, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
