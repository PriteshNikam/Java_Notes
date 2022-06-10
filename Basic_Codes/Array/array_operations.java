package com.company;
import java.util.Arrays;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        int[] arr;            //declared array
        arr=new int[5];       //memory allocation

        int [] ar=new int[5]; //declared and memory allocation. (primitive data type)(Collections methods not work for this.)

        Integer [] a=new Integer []{20,10,40,30,50};//declared array and assigned values directly(not primitive data type)(collections methods work for this)
        //Collections only work on this kind of array declaration.

        //here we have seen 3 types of array declaration.
        arr[0]=4;  //to add el in array.
        arr[1]=3;
        arr[2]=2;
        arr[3]=5;
        arr[4]=1;
        System.out.println("print array in 1 line of code: "+Arrays.toString(arr));//to print array in one line.
//        Arrays.parallelSort(arr);//this sort array in one line of code
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){   //loop will iterate 5 times (0,1,2,3,4)
//            System.out.print(arr[i]+" ");
//        }
        //*************************************************************************//
//        System.out.println(arr);  //this will print reference value.   //**important**
        Arrays.sort(a,Collections.reverseOrder());           //this will sort array in descending order.but for this you should declare array in cap. Integer.
        System.out.println("sorted in descending order: "+Arrays.toString(a));
        Boolean b=Arrays.asList(arr).contains(5);     //this will return T or F if array contain ele. 5.
        System.out.println(b);
        Arrays.sort(arr);
        //int[] ar2=ArrayUtils.addAll(arr,ar1);// to combine 2 arrays (not working)


    }
}
