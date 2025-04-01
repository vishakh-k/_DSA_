// Add all the zeros to end of the array 

import java.util.Scanner;

public class day2 {
   public void movesZero(int [] arr){
        int j=0; //for storeing after itering over the array
        int n=arr.length;
        for(int i=0;i<n;i++){ //itering each element of an array
            if(arr[i]!=0){
                if(i!=j){
                    //swapping each element of an array if 0 occurs
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
   }
   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=scanner.nextInt();
        System.out.println("Enter the elements in array");
        int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
        day2 sol=new day2();
        sol.movesZero(arr);
        System.out.println("After moving all the zeros to end the array becomes");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        scanner.close();
   } 
}
