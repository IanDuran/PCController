package com.example.usuario.pccontroller;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KeyboardActivity extends AppCompatActivity {

    private KeyboardView keyboardView;
    private Keyboard keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_keyboard_layout);
        keyboard = new Keyboard(this, R.xml.qwerty);
        keyboardView = (KeyboardView)findViewById(R.id.custom_keyboard);
        keyboardView.setKeyboard(keyboard);
        keyboardView.setOnKeyboardActionListener(new CustomKeyboard());
    }
}
