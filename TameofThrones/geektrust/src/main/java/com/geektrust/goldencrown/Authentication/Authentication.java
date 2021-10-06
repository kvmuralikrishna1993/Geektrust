package com.geektrust.goldencrown.Authentication;

import java.util.HashMap;


public class Authentication {

    public Boolean authenticate(String message, String emblem){

        HashMap<Character, Integer> messageMap =  getMap(message);
        HashMap<Character, Integer> emblemMap =  getMap(emblem);

        for (Character ch:emblemMap.keySet()) {
            if(!messageMap.containsKey(ch)) return false;
            if(emblemMap.get(ch) > messageMap.get(ch)) return false;
        }

        return true;
    }

    public HashMap<Character, Integer> getMap(String string){

        HashMap<Character, Integer>  emblemMap =  new HashMap<Character, Integer>();

        for (char ch: string.toLowerCase().toCharArray()) {
            if(emblemMap.containsKey(ch)) emblemMap.put(ch, emblemMap.get(ch)+1);
            else emblemMap.put(ch,1);
        }

        return emblemMap;
    }


}
