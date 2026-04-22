class Solution {

    public  String encode(List<String> strs) {

         if (strs.isEmpty()) return ""; 
		 StringBuilder sb =new StringBuilder();
		 
		 for(String str : strs) {
			for( char c: str.toCharArray()) {
			int i = c;
			sb.append(i+""); 
			sb.append(".");
			}
			sb.append("#");
		 }
		 
		
		return sb.toString();

	    }

	    public  List<String> decode(String str) {
			
             if (str.length() == 0) {
            return new ArrayList<>();
        }
	       String[] sArr=	str.split("#");
	       List<String> res = new ArrayList<>();
	       
	       for(String s : sArr ) {
	    	   String r = new String("");
	    	  for(String c : s.split("\\.")) {
	    		  
                  if(!c.equals("")){
	    		     char cs = (char) Integer.parseInt(c);
	    		
	    		     r= r+ cs;
                  }
	    	  }
	    	  res.add(r);
	    	   
	    	  
	       }
	       
	       System.out.println(res);
	    	
	    	return  res.isEmpty() ? Arrays.asList("") : res;

	    }
}
