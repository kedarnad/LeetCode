package Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagrams {

    public List<Integer> findAnagrams(String s, String p){
        int l = s.length();
        int k = p.length();

        int i=0;

        List<Integer> list = new ArrayList<Integer>();
        //Defining a list object

        while((i+k)<=l){
            char[] schar= s.substring(i, i+k).toCharArray();
            Arrays.sort(schar);

            char[] pchar =p.toCharArray();
            Arrays.sort(pchar);

//            System.out.println(String.valueOf(schar));

            if(String.valueOf(schar).equals(String.valueOf(pchar)))
                list.add(i);

            i++;
        }


        return list;
    }


    public static void main(String args[]){
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> l = new findAllAnagrams().findAnagrams(s,p);

        System.out.println(l);

        l= new findAllAnagrams().findAnagrams("abab", "ab");
        System.out.println(l);



    }

}
