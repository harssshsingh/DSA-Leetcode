class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] b= new int[n];
        b[0]=nums[0];
        for(int i=1;i<n;i++){
            b[i]=b[i-1]*nums[i];
        }
        int prod=1;
        for(int i = n-1; i > 0; i--) 
        { 

            b[i] = b[i-1] * prod; 

            prod *= nums[i]; 

        } 
        b[0] = prod; 
        return b;
    }
    
}