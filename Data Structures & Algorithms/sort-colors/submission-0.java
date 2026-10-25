class Solution {
    public void sortColors(int[] nums) {
            int zeroCounts=0;
        int oneCounts =0;
        int twoCounts=0;

        for(int n : nums){
            if(n==0)
                zeroCounts++;
            if(n==1)
                oneCounts++;
            if(n==2)
                twoCounts++;
        }

        for(int i=0; i< nums.length; i++){
            if(zeroCounts!=0){
                nums[i]= 0;
                zeroCounts--;
            }else if( oneCounts !=0){
                nums[i]=1;
                oneCounts--;
            }else{
                nums[i]=2;
                twoCounts--;
            }
        }


    }
}