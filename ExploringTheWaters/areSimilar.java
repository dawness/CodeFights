boolean areSimilar(int[] a, int[] b) {
int size= a.length, temp1=-1,temp2,j=0,k=0;
	boolean flag=true;
	for(int i=0;i<size;i++) {
		if(a[i]!=b[i]) {
			if(temp1== -1) {
			temp1=b[i];
			j=i;
			}
			else {
				temp2= b[i];
				k=i;
				b[j]=temp2;
				b[k]=temp1;
				break;
				
			}
			
		}
	}
	
for(int i=0;i<size;i++)	{
	if(a[i] == b[i])
		flag= true;
	else
	{
		flag= false;
		break;
	}
}
	
	
return flag;

}
