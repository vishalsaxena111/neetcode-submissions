class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        permutationHelper(nums, 0, new boolean[nums.length], new ArrayList<>(), res );

        return res;

    }

    public void permutationHelper(int[] arr, int pos, boolean[] selected ,
    List<Integer> ans,  List<List<Integer>> res){

        if(pos==arr.length){
            System.out.println(ans);
            res.add(new ArrayList<>(ans)); // Create a copy
            return;
             
        }


        for(int i=0; i<arr.length; i++){
            if(selected[i]==false){
                selected[i]= true;
                ans.add(arr[i]);
                permutationHelper(arr, pos +1 , selected, ans, res);
                selected[i]=false;
                ans.remove(ans.size()-1);
            }
        }

    }


}
