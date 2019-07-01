package com.stackroute.junitdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args_) throws IOException {

            String line;
        Map<String, Integer> map = new HashMap<>();
            FileReader fr = new FileReader("/home/shivani/file.txt");
            BufferedReader br = new BufferedReader(fr);
            while( (line = br.readLine())!= null) {
                String[]  words = line.split("\\s");


            for (String w : words) {
                Integer n = map.get(w);
                n = (n == null) ? 1 : ++n;
                map.put(w, n);
            }}
        System.out.println(map);
        }
    }
