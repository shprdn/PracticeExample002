package com.stackroute.junitdemo;

import java.io.*;
import java.nio.Buffer;

public class UpperCaseFile {
    public static void main(String[] args) throws  IOException
    {
       int ch;
       FileReader fr = null;
       try {
           fr = new FileReader("/home/shivani/file.txt");
       }
       catch (FileNotFoundException e)
       {
           System.out.println("file not found");
       }
       while ((ch=fr.read())!=-1){
           if(Character.isLowerCase(ch))
               ch = Character.toUpperCase(ch);
           System.out.print((char)ch);
       }
       fr.close();

    }
}