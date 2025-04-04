package arrays;

public class MaxPosNeg {
    public int countPosNeg(int arr[]) {
        int pos = 0, neg = 0, zero = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        int maxCount=pos;
        if(neg>maxCount){
            maxCount=neg;
        }
       return maxCount;
    }

    public static void main(String[] args) {
        int arr[] = {-1, -2, -3, -4, -5, 6};
        MaxPosNeg sol = new MaxPosNeg();
        int ans = sol.countPosNeg(arr);
        
        System.out.println(ans);  // This will print the larger of positive or negative count
    }
}

