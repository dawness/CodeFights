String[] allLongestStrings(String[] inputArray) {
int countArrays= inputArray.length,max=0,val;
		
		for(int i=0;i< countArrays;i++) {
			val=inputArray[i].length();
			if(max < val)
				max=val;
		}
	ArrayList<String> list = new ArrayList<String>() ;
	
	for(int i=0;i< countArrays;i++)
		if(inputArray[i].length()==max) {
			
		list.add(inputArray[i]);
		}
	String[] array= list.toArray(new String[list.size()]);
	return array;
	
}
