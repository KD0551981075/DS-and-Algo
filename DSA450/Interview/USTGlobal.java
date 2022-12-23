package Interview;

//Check whether strings are anagrams (S1 = god and s2 = dog ; S1 = army and s2 = mary)

import java.util.Arrays;

public class USTGlobal {

    public static void main(String[] args) {
        char[] s1 = "army".toCharArray();
        char[] s2 = "mary".toCharArray();

        //sort
        Arrays.sort(s1);
        Arrays.sort(s2);

        if(s1.length == s2.length){
            System.out.println( "Is AnaGram :"+Arrays.equals(s1,s2));

        }
        else {
            System.out.println("not of same size");
        }

    }
}


