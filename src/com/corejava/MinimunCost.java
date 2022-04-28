package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinimunCost {

    public static void main(String args[]){
        System.out.println("Hello");
        //int[] abcEven = {4,5,6,7,8,9,10,11,12,13,14,15};
       // int[] abcOdd = {2,3,4,5,6,7,8,9,10,11,12};
        int[] abcEven = {1,2,3,4};
        int[] abcOdd = {1,2,3,4,5};
        MinimunCost minimunCost = new MinimunCost();
        System.out.println("Initial Array "+abcEven.length);
        int k =  minimunCost.calculateMinCost(abcEven.length,abcEven,2);
System.out.println(k);
        int k1 =  minimunCost.calculateMinCost(abcOdd.length,abcOdd,2);
        System.out.println(k1);
    }


    public int calculateMinCost(int a,int[] b,int c){
        int finalValue =0;

        int[] minimisedArray = reduceArray(b,c);
        while(minimisedArray.length>2){
         //   System.out.println("Before " + minimisedArray.length);
            minimisedArray =  reduceArray(minimisedArray,c);
         //  System.out.println("After " + minimisedArray.length);
        }
        //System.out.println(minimisedArray[0]);
        //System.out.println(minimisedArray[1]);
        finalValue = minimisedArray[0] +minimisedArray[1];
        return finalValue*c;

    }

    private int[] reduceArray(int[] k,int c)
    {
        int[] minimisedArray=null;
        ArrayList list =  new ArrayList<>();

        if (k.length%2 ==0){

            for(int i=0;i<k.length-1;i=i+2)
            {
                int value = (k[i]+k[i+1])*c;
                list.add(value);

            }
        }else{
            for(int i=0;i<k.length-2;i=i+2){
                int value = (k[i]+k[i+1])*c;
                list.add(value);

            }

        }
        if (k.length%2 ==0) {
            minimisedArray=new int[list.size()];
        }else{
            minimisedArray=new int[list.size()+1];
        }


     for(int l = 0;l<list.size();l++){

         minimisedArray[l]= Integer.parseInt(String.valueOf(list.get(l)));

     }
        if (k.length%2 ==0) {

        }else{
              minimisedArray[minimisedArray.length-1] = k[k.length-1];
        }

        return minimisedArray;
    }
}
