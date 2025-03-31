// Find the second largest element of an array

import java.util.Scanner;
public class day1 {
     public int secondLargest(int[] arr){

            // create two variables to store the max value and secmax value
             int max1=Integer.MIN_VALUE;
             int max2=Integer.MIN_VALUE;
             for(int i=0;i<arr.length;i++){
                 if(arr[i]>max1){
                     max2=max1;
                     max1=arr[i];
                 }else if(arr[i]>max2 && arr[i]!=max1){
                     max2=arr[i];
                 }        
             }
             return (max2==Integer.MIN_VALUE)? -1 : max2;
          }
          public static void main(String[] args) {
             Scanner scanner =new Scanner(System.in);
             System.out.println("Enter the size of an array");
             int n=scanner.nextInt();
             int arr[]=new int[n];
             System.out.println("Enter the array elements");
             for(int i=0;i<n;i++){
                 arr[i]=scanner.nextInt();
             }
             day1 sol=new day1();
             int ans = sol.secondLargest(arr);
        System.out.println("The second largest is:"+ans);
        scanner.close();
    }
}