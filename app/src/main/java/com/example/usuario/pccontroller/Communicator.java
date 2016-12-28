package com.example.usuario.pccontroller;

import android.os.AsyncTask;
import java.io.DataOutputStream;
import java.net.Socket;

public class Communicator {
    private final int SOCKET = 6666;
    private final String SERVER_IP = "192.168.0.109";

    public void send(String message){
        new SendMessageTask(SERVER_IP, SOCKET).execute(message);
    }

    private class SendMessageTask extends AsyncTask<String, Void, Void>{
        private String ip;
        private int socketNumber;

        public SendMessageTask(String ip, int socketNumber){
            this.ip = ip;
            this.socketNumber = socketNumber;
        }

        @Override
        protected Void doInBackground(String... strings) {
            try{
                Socket socket = new Socket(ip, socketNumber);
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                output.writeUTF(strings[0]);
                output.flush();
                output.close();
                socket.close();
            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }
    }
}
