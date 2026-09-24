class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
         int longest =0;
        for(int num : nums){
            set.add(num);
        
        }

        for( Integer num : set ){

            // skip if consecutive number exist 
            if(set.contains(num - 1)){
                continue;
            }

            // num is the beginning
            int current = num;
            int length = 1;

            while (set.contains(current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);

           

        }
         return longest;

    }
}
