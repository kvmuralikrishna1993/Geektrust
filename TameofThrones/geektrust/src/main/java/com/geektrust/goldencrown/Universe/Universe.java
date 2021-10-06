package com.geektrust.goldencrown.Universe;

import java.util.HashMap;

public class Universe {

    private  HashMap<String, String>  kingdoms =  new HashMap<String, String>();

    public Universe(){
        kingdoms.put("SPACE","Gorilla");
        kingdoms.put("LAND","Panda");
        kingdoms.put("WATER","Octopus");
        kingdoms.put("ICE","Mammoth");
        kingdoms.put("AIR","Owl");
        kingdoms.put("FIRE","Dragon");
    }

    public HashMap<String, String> myUniverse(){

        return kingdoms;
    }

}
