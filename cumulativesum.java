import java.util.Scanner;

import java.util.Arrays;
class cumulativesum{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=Sc.nextInt();
    if(size>0){
            System.out.println("enter the elements");
            int[] Array1=new int[size];
             int[] Array2=new int[size];
             int temp=0;
             for(int i=0;i<size;i++)
             {
                Array1[i]=Sc.nextInt();
                temp=Array1[i]+temp;
                Array2[i]=temp;
             }
             
                System.out.println(Arrays.toString(Array2));
            }
            
         else{
            System.out.println("invalid range");
         }
        }
    }