//java program to find the sum of first n natural numbers
//SumofNaturalNumbers.java

import java.io.*;
import java.util.*;
public class SumofNaturalNumbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value from 1to20");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
   sum=sum+i;
}
System.out.println("Sum of first "+n+" natural numbers is "+sum);
}
}
