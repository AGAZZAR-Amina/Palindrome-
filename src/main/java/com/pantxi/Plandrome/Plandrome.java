package com.pantxi.Plandrome;
import java.lang.*;

public class Plandrome {

    public static String IsPlandrome(String chaine) {
         String res = "true";

        if (chaine.length() <= 1) {
           res  =  "true" ;
        }

//        else {
//            int left = 0 ;
//            int right = chaine.length()-1 ;
//
//
//        }
        else
            res = "false";



        return res;
    }

    }
