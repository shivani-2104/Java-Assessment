package com.company.Day6.Assesment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sum
{
    static boolean check(List <Integer>list,int sum)
    {
        HashMap <Integer ,Integer>map=new HashMap<>();

        for(int i:list)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int x;
        for(int i:list)
        {
            x=sum-i;
            if(map.containsKey(x)) {
                if (i != x)
                    return true;
                int count = map.get(x);
                if (i != x && count > 1)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List <Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean b=check(list,9);
        System.out.println(b);
    }
}



