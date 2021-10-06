package com.geektrust.goldencrown;

import com.geektrust.goldencrown.Allegiance.Allegiance;
import com.geektrust.goldencrown.Scan.Scan;
import java.util.LinkedHashMap;


public class Geektrust {
//    public static LinkedHashMap<String, String> inputMap = new LinkedHashMap<String, String>();
    public static void main(String[] args) {

        LinkedHashMap<String, String> inputMap;
        if (args.length < 1) {
            System.out.println("Input file not found");
            System.out.println("USAGE: java Geektrust 'filename'");
            return;
        }else{
            Scan sc = new Scan();
            inputMap = sc.scan(args[0]);
            Allegiance allegiance = new Allegiance();
            System.out.print(allegiance.allegiance(inputMap));
        }
    }

}
