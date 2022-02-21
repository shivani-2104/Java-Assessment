package com.company.Day6.Assesment;
import  java.util.*;
public class TopKMaximum {
    static List max(List list,int k)
    {
        Collections.sort(list,Collections.reverseOrder());

        return list.subList(0,k);
    }
    public static void main(String ar[])
    {
        List <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(40);
        list.add(5);
        List newList=max(list,3);
        System.out.println(newList);
    }
}
