package arrays;
// Print the Reversed array

import java.util.Scanner;

public class day3 {
    public void reverseArray(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
            for(int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
            }
        day3 sol=new day3();
        sol.reverseArray(arr);
        System.out.println("Reveresed array");
        for(int num:arr){
            System.out.println(num);
        }
        scanner.close();
    }
}