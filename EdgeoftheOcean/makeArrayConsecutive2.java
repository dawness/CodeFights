int makeArrayConsecutive2(int[] statues) {
    Arrays.sort(statues);
    int count=0;
	int add=1;
	int size = statues.length -1;
    int i=0;
		while(i<size) {
			if(statues[i+1]== statues[i] + add) {
				i++;
				add =1;
			}
			else {
				count= count +1;
				add= add+1;
			}
			
		}
		
return count;
}
