package LinkedList;

import java.util.*;  
public class Demo1{  
public static int getThirdLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-3];  
}  
public static void main(String args[]){  
    int a[]={1,2,5,6,3,4};  
    int b[]={44,66,99,77,33,22,55};  
    System.out.println("Third Largest: "+getThirdLargest(a,6));  
    System.out.println("Third Largest: "+getThirdLargest(b,7));  
}}  