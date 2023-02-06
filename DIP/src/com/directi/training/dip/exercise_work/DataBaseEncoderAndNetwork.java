package com.directi.training.dip.exercise_work;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class DataBaseEncoderAndNetwork implements Encoder {
    public String protocole = "http";
    public String name = "";

    @Override
    public void encode() {

        try {
            URL url;
            url = new URL("http", "myfirstappwith.appspot.com", "/index.html");
            InputStream in;
            in = url.openStream();
            InputStreamReader reader = new InputStreamReader(in);
            StringBuilder inputString1 = new StringBuilder();
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
            String inputString = inputString1.toString();
            String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
            MyDatabase database = new MyDatabase();
            database.write(encodedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}