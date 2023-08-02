// considering array to be zero-indexed
//one possible solution would be brute force
// traverse through the array and find the largest sum
// this would give the time complexity of O(n^2)
//thus we use Kadeans algorithm 
// Here we start from the back i.e. calculate the sum of every sub array ENDING with A[i].
// After calculating all aub arrays the maximum value would be called local maximum at A[i]
//After calculating all local maxima we would have one max num which would be the global maximum
// Instead of calculating all local maximas what we do is 
// local max at A[i] would be local maxima at A[i-1]+A[i]
// thus we are using past calculations hence we are using dynamic programming.
// therefore global maximum would be max(A[i],local_max at (A[i-1]+A[i])
//Read Kadeans algo article from medium if not clear
//here time complexity would be O(n)


class Solution {
    public int maxSubArray(int[] nums) {
       int local_maximum=0;
       int global_maximum=Integer.MIN_VALUE;
       
       for(int i=0;i<nums.length;i++){
           local_maximum=Math.max(nums[i],local_maximum+nums[i]);
          if(local_maximum>global_maximum){
              global_maximum=local_maximum;
          }
       }
        return global_maximum;
       }
}
    