package com.company;

import java.util.Scanner;

public class TwoDarray {
    public static void Fibonacci (int n)
    {
        if (n<=1)
            System.out.println(n);
        int temp[]=new int[n+1];
        temp[0]=0;
        temp[1]=1;
        for (int i=2;i<=n;i++)
        {
            temp[i]=temp[i-1]+temp[i-2];
        }
        for (int i=1;i<=n;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        System.out.println("2D Array -: ");
        int arr[][]=new int [10][];
        for (int i=0;i<10;i++)
            arr[i]=new int[i+1];
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<arr[i].length;j++)
                arr[i][j]=i+j;
        }
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the Number of Fibonacci Numbers You Want");
        int n=obj.nextInt();
        System.out.println("First "+n+" Fibonacci Numbers are -: ");
        Fibonacci (n);
    }
}
