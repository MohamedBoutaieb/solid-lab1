package com.directi.training.dip.exercise_work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FileEncoder implements Encoder
{
        
        public String base = "DIP/src/com/directi/training/dip/exercise/" ; 
        public String source ;
        public String destination ;

        public FileEncoder(String source, String destination) {
            this.source = source;
            this.destination = destination;
        }

        @Override
        public void encode() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(
                new FileReader(base+source));
            writer = new BufferedWriter(
                new FileWriter(base+destination));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                writer.append(encodedLine);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }
        } 
        }
      
}
