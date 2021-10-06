package com.geektrust.goldencrown.Seaser;

public class SeaserCipher {

    public StringBuffer encryptMessage(String message, int offset) {

        StringBuffer result= new StringBuffer();

        for (int i=0; i<message.length(); i++)
        {
            if (Character.isUpperCase(message.charAt(i)))
            {
                char ch = (char)(((int)message.charAt(i) +
                        offset - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)message.charAt(i) +
                        offset - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;

    }

    public StringBuffer decryptMessage(String message, int offset){

        return encryptMessage(message, 26 - (offset % 26));
    }

}

