package com.geektrust.goldencrown.Allegiance;

import org.junit.Test;

import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertEquals;


public class AllegianceTest {

    Allegiance obj = new Allegiance();
    LinkedHashMap<String, String> inputMap = new LinkedHashMap<String, String>();

    @Test
    public void allegiance1() {

            inputMap.put("AIR", "ROZO");
            inputMap.put("LAND","FAIJWJSOOFAMAU");
            inputMap.put("ICE","STHSTSTVSASOS");
            assertEquals("SPACE AIR LAND ICE",obj.allegiance(inputMap));

    }

    @Test
    public void allegiance2() {

            inputMap = new LinkedHashMap<String, String>();
            inputMap.put("LAND","FDIXXSOKKOFBBMU");
            inputMap.put("ICE","MOMAMVTMTMHTM");
            inputMap.put("WATER","SUMMER IS COMING");
            inputMap.put("AIR","OWLAOWLBOWLC");
            inputMap.put("FIRE","AJXGAMUTA");
            assertEquals("SPACE LAND ICE FIRE",obj.allegiance(inputMap));

    }

    @Test
    public void allegiance3() {

            inputMap = new LinkedHashMap<String, String>();
            inputMap.put("AIR","OWLAOWLBOWLC");
            inputMap.put("LAND","OFBBMUFDICCSO");
            inputMap.put("ICE","VTBTBHTBBBOBAB");
            inputMap.put("WATER","SUMMER IS COMING");
            assertEquals("NONE",obj.allegiance(inputMap));

    }

}