package com.tnsif.exceptions;

import java.io.*;

public class checkedjava{

    public static void main(String[] args) {
        File f = new File("Hello.txt");

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
