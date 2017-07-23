package com.example.usuario.pccontroller;

import android.inputmethodservice.KeyboardView;



public class CustomKeyboard implements KeyboardView.OnKeyboardActionListener {

    private Communicator communicator;

    public CustomKeyboard(){
        this.communicator = new Communicator();
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int i, int[] ints) {
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
