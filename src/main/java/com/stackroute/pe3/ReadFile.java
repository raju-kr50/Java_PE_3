package com.stackroute.pe3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String fileName = "temp.txt";
        File f = new File(fileName);
        System.out.println("path " +f);
        System.out.println("Exist "+f.exists());
        System.out.println("Is there "+f.isDirectory());
        System.out.println(f.length());
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

    }

}