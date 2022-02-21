package com.company.Day6.Assesment;
import java.util.*;
import java.util.function.Predicate;

public class RemoveNegativeInteger {
    public static void main(String ar[])
    {
        List <Integer> list=new ArrayList<>();
        List <Integer> newList=new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(2);
        list.add(4);
        Predicate<Integer> ob=(i) ->i>0;
        for(int i:list)
        {
            if(ob.test(i))
                newList.add(i);
        }
        System.out.println(newList);
    }
}
