int arrayMaximalAdjacentDifference(int[] inputArray) {
int max=0;
for(int i=0;i+1< inputArray.length; i++) {
	int val=Math.abs(inputArray[i]-inputArray[i+1]);
	if(val > max)
		max= val;
		
}

return max;

}
