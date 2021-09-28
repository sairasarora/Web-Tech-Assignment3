package com.company;

public class OperationsOnArray {
    public static double AverageSum (int []inputArray)
    {
        int sum=0;
        for (int i=0;i<inputArray.length;i++)
            sum+=inputArray[i];
        return sum/inputArray.length;
    }
    public static int SecondLargest (int []inputArray)
    {
        int size=inputArray.length;
        int temp1=0;
        int temp2=0;
        for (int i=0;i<size;i++)
        {
            if (inputArray[i]>temp1)
            {
                temp2=temp1;
                temp1=inputArray[i];
            }
            else
            {
                if (inputArray[i]>temp2)
                    temp2=inputArray[i];
            }
        }
        return temp2;
    }
    public static void PrintOdd (int []inputArray)
    {
        int size=inputArray.length;
        for (int i=0;i<size;i++)
        {
            if (inputArray[i]%2==1)
                System.out.print(inputArray[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        int []inputArray={23, 6, 47, 35, 2, 14};
        System.out.println("Average Sum of the array is-: "+AverageSum(inputArray));
        System.out.println("Second Largest Element of the array is-: "+SecondLargest(inputArray));
        System.out.print("Odd Numbers of the array are-: ");
        PrintOdd (inputArray);
    }
}
