class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        	 Map<Integer, List<Integer>> map = new HashMap<>();
		 for(int i=0; i<nums.length; i++) {
			 
			 map.putIfAbsent(nums[i], new ArrayList<>());
			 map.get(nums[i]).add(nums[i]);
		 }
		 
		 
	  
	map = map.entrySet().stream()
        .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1, // Merge function for duplicate keys (not applicable here)
                LinkedHashMap::new // Collect into a LinkedHashMap to maintain order
            ));
	
	List<Integer> l = map.keySet().stream().collect(Collectors.toList());
	
	int[] res = new int [k];
	
	for(int i=0; i< l.size(); i++) {
		if(i>k-1)
			break;
		res[i] = l.get(i);
		
	}
		
	for(int i : res)
	System.out.println(i);
		
		
		return res;
    }
}
