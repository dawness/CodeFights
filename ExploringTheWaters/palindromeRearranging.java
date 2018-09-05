boolean palindromeRearranging(String inputString) {
    
    Map <String,Integer> map = new HashMap<String,Integer>();
	boolean flag= true;
	int count=1;
	int size= inputString.length();
	char[] str= inputString.toCharArray();
	char ch;
	for(int j=0;j<size;j++) {
		count =1;
		ch=str[j];
		if(!map.containsKey(String.valueOf(ch)) ){
	for(int i=j+1;i<size;i++) {
		if(ch==str[i]) {
			count= count +1;
		
		}
		
		
	}
	map.put(String.valueOf(ch),Integer.valueOf( count));
		}
	}
	
	
	
	if(size % 2 ==0) {
	for(Integer v : map.values()) {
			
	if (v % 2 == 0)
		flag= true;
	else {
		flag= false;
	break;
	}
	}
	}
	
	else
	{
		count=0;
		for(Integer v : map.values()) {
			
			if (v % 2 == 0)
				flag= true;
			else
				count= count +1;
			}

	
	if (count!=1) 
		flag=false;
	}
	
	
	return flag;

}
