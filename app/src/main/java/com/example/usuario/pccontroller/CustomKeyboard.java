package com.example.usuario.pccontroller;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;



public class CustomKeyboard implements KeyboardView.OnKeyboardActionListener {

    private Communicator communicator;
    private Keyboard keyboard;
    private KeyboardView keyboardView;
    private boolean caps;

    public CustomKeyboard(Keyboard keyboard, KeyboardView keyboardView){
        this.communicator = new Communicator();
        this.keyboard = keyboard;
        this.keyboardView = keyboardView;
        this.caps = false;
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {
        if(i == 16 || caps){
            caps = !caps;
            this.keyboard.setShifted(caps);
            this.keyboardView.invalidateAllKeys();
        }
        communicator.send(i);
    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
