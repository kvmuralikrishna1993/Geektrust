package com.geektrust.goldencrown.Scan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Scan {

    public LinkedHashMap<String, String> scan(String path){

        if(path.length() == 0) return null;

        File file = new File(path);
        ArrayList<String> tokens =  new ArrayList<String>();
        LinkedHashMap<String, String> input =  new LinkedHashMap<String,String>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                tokens.add(sc.nextLine());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i=0; i< tokens.size();i++) {
            String[] temp  = tokens.get(i).split(" ",2);
            input.put(temp[0], temp[1]);
        }

        return input;

    }

}
