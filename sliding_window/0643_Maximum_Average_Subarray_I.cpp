#include <iostream>
#include <vector>
#include<climits>
using namespace std;
double findMaxAverage(vector<int>&nums, int k){
   int n = nums.size(); 
   int l = 0; 
   double sum = 0; 
   for(int i =0; i<k; i++){
    sum += nums[i];
   } 
   double maxi = sum; 
   for(int i = k; i<n; i++){
    sum += nums[i]; 
    sum -= nums[i-k]; 
    maxi = max(maxi, sum); 
   }
   return maxi/k; 
}

int main(){
    vector<int> nums = {1, 12, -5, -6, 50, 3}; 
    int k = 4; 
    double result = findMaxAverage(nums, k); 
    cout << "Maximum average subarray of size " << k << "is: " << result << endl; 
}