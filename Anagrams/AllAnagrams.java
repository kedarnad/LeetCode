package Anagrams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {

    ArrayList<Integer> al = new ArrayList<Integer>();

    public List<Integer> findAnagrams(String s, String p){
        int sLength = s.length();
        int pLength =p.length();

        for(int i =0; i <sLength-pLength+1; i++){
            String subs =s.substring(i, i+pLength);

            if(new AllAnagrams().isAnagram(subs, p))
                al.add(i);
        }

        return al;
    }


    public boolean isAnagram(String subs, String p){

        int[] allLetter = new int[26];
        Arrays.fill(allLetter, (char) 0);

        for(int i =0;i <subs.length(); i++){
            allLetter[subs.charAt(i)-'a']++;
        }

        for(int i =0; i <p.length(); i++){
            allLetter[p.charAt(i)-'a']--;
        }


        for(int i =0; i<allLetter.length;i++){
            if(allLetter[i]!=0)
                return false;
        }

        return true;
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
