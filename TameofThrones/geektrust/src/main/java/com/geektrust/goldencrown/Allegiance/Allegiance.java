package com.geektrust.goldencrown.Allegiance;

import com.geektrust.goldencrown.Authentication.Authentication;
import com.geektrust.goldencrown.Seaser.SeaserCipher;
import com.geektrust.goldencrown.Universe.Universe;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Allegiance {

    private ArrayList<String> allies = new ArrayList<String>();

    public String allegiance(LinkedHashMap<String, String> inputMap){
        Universe universe = new Universe();
        SeaserCipher seaser = new SeaserCipher();
        Authentication auth = new Authentication();

        for (String key : inputMap.keySet()) {
            //get the encrypted message
            String cipherMessage = inputMap.get(key);
            cipherMessage = cipherMessage.replaceAll("\\s", "");

            //get the emblem of kingdom
            String emblem = universe.myUniverse().get(key);

            //decypher the message
            String decipherMessage = seaser.decryptMessage(cipherMessage ,emblem.length()).toString();

            //authenticate the message
            if(auth.authenticate(decipherMessage,emblem)) allies.add(key);
        }

        //verify whether ruler has required allies.
        if(allies.size() < 3) return "NONE";
        else{
            String result = "";
            result += "SPACE";
            for (String kingdom:allies ) result +=" "+kingdom;
            return result;
        }

    }
}
