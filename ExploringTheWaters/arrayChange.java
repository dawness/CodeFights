int arrayChange(int[] inputArray) {
int count=0;
	int size = inputArray.length;
	for(int i=0;i+1<size; i++) {
		while(inputArray[i+1]<=inputArray[i]) {
		inputArray[i+1]= inputArray[i+1]+ 1;
		
		count= count +1;
		}
	}
			
	
	
	return count;

}
