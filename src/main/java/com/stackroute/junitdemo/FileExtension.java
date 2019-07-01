package com.stackroute.junitdemo;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;


public class FileExtension {
    public String getFile() throws IOException{
        String out="";
        File file = new File("/home/shivani/Desktop");
        File[] files = file.listFiles();
        for(File f:files){
            out=out+f.getName()+" ";
        }
        Path path= Paths.get("/home/shivani/Desktop/Pankh.html");
        byte[] data= readAllBytes(path);
        return out.trim()+"\n"+new String(data).trim();
    }
}

