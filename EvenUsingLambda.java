package com.company.Day6.Assesment;
import java.util.*;
import java.util.function.Predicate;
public class EvenUsingLambda {
    public static void main(String ar[])
    {
        List <Integer>listOfIntegers=new ArrayList<>();
        List <Integer>newList=new ArrayList<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(15);
        listOfIntegers.add(10);

        Predicate<Integer> ob1 = (i) -> i % 2==0;
        for(int i:listOfIntegers)
       {
          if(ob1.test(i))
           newList.add(i);
       }
System.out.println(newList);

    }




}
