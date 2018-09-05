int[] sortByHeight(int[] a) {
    
    int size= a.length;	
int i=0,j=1,temp;
while(i<size) {
	j=i+1;
while((j<size)) {
while(a[i]==-1) {
		i++;
		if(i>=size)
			break;
		j=i+1;
}
if(j<size)
while(a[j]==-1)
	j++;
if(( j< size))
	if(a[i] > a[j]) {
		temp=a[i];
	
		a[i]=a[j];
		a[j]=temp;
	
		
}

j++;
}
i++;
}
	
	return a;


}
