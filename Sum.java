package com.company.Day6.Assesment;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static boolean sum(List<Integer> list,int s)
    {
        int i=0,j=1;
while(i<list.size())
{
    while(j<list.size())
    {
        if(list.get(i)+list.get(j)==s)
            return true;
        j++;
    }
    i++;
    j=i+1;
}
return false;
    }
    public static void main(String[] args) {
        List <Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(sum(list,6));
        System.out.println(sum(list,5));
        System.out.println(sum(list,10));
        System.out.println(sum(list,1));
    }
}
