package com.pantxi.Plandrome;
import java.lang.*;

public class Plandrome {

    public static String IsPlandrome(String chaine) {
        String res = "true";
        chaine = chaine.toLowerCase();
         int  var = chaine.length() ;
        if (chaine.length() <= 1) {
            res = "true";
        } else if(chaine.length()>1){
            int left = 0;
            int right = chaine.length() - 1;

            while (left < right) {
                if(chaine.charAt(left)!=chaine.charAt(right)) {

                    res = "false" ;
                }
               left++ ;
                right -- ;
            }


        }




        return res;
    }
}

