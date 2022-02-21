package com.company.Day6.Assesment;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
    static boolean check(String s1,String s2)
    {
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1=new String(c1);
        s2=new String(c2);
        if(s1.equals(s2))
            return true;
        return false;
    }
    public static void main(String ar[])
    {
        String s1="ishivi";
        String s2="viishi";
        if(check(s1,s2))
        {
            System.out.println("Yes Anagram");
        }
        else
        {
            System.out.println("No Anagram");
        }
    }
}
