package com.company;

public class Matrix {
    public static int[][] Multiply (int [][]mat1,int [][]mat2)
    {
        int r1=mat1.length;
        int c1=mat1[0].length;
        int r2=mat2.length;
        int c2=mat2[0].length;
        if (c1!=r2)
            return null;
        int result[][]=new int [r1][c2];
        for (int i=0;i<r1;i++)
        {
            for (int j=0;j<c2;j++)
            {
                int sum = 0;
                for(int k=0; k<c1; k++){
                    sum += mat1[i][k] * mat2[k][j];
                }
                result[i][j]=sum;
            }
        }
        return result;
    }
    public static int Trace (int [][]mat1)
    {
        int sum=0;
        int size=mat1.length;
        for (int i=0;i<size;i++)
        {
            sum+=mat1[i][i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int matrix1[][]={{1,2},{3,4},{5,6}};
        int matrix2[][]={{1,2,3},{4,5,6}};
        System.out.println("Matrix 1 :");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<matrix1[i].length;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 :");
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<matrix2[i].length;j++)
            {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrices after Mutiplication");
        int [][]result=Multiply(matrix1,matrix2);
        for (int i=0;i<result.length;i++)
        {
            for (int j=0;j<result[i].length;j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
        System.out.println("Trace of the output Matrix is -: "+Trace (result));
    }
}
