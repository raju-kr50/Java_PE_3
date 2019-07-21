package com.stackroute.pe3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String fileName = "temp.txt";
        File f = new File(fileName);
        System.out.println("path " +f);

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("This is just a demo content in temp.txt file");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String string = dis.readUTF();
        System.out.println(string);
        string=string.toUpperCase();
        System.out.println(string);
    }

}