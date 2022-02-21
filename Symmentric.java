package com.company.Day6.Assesment;

public class Symmentric {
    static int[][] transpose(int matrix[][])
    {
        int temp;
        int transpose[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=matrix[j][i];
            }
            System.out.println();
        }

        return transpose;
    }
    static boolean check(int matrix[][],int transpose[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) {
                if (matrix[i][i] != transpose[i][j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][]={
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int transpose[][]=transpose(matrix);
        boolean result= check(matrix,transpose);
       if(result)
       {
           System.out.println("Given matrix is symmetric");
       }
       else
       {
           System.out.println("Given matrix is not  symmetric");
       }

    }
}
