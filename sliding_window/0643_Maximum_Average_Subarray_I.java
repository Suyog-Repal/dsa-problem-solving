import java.util.*; 
 class Main{
    public static double findMaxAverage(int[] nums,  int k){
      int n =    nums.length; 
      double sum = 0; 
      //double maxi = Double.MIN_VALUE; 
      for(int i =0; i<k; i++){
         sum += nums[i]; 
      }
      double maxSum = sum; 
      // sliding window; 
      for(int i = k; i<n; i++){
              sum += nums[i]; 
              sum -= nums[i-k]; 
              maxSum = Math.max(maxSum, sum); 
      }
      return maxSum/k; 

    }
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4; 
        double result = findMaxAverage(nums, k); 
        System.out.println("Maximum average subarray of size " + k + " is: " + result); 

    }
}