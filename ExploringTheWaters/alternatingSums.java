int[] alternatingSums(int[] a) {
int[] sum= new int[2];
	sum[0]=0;
	sum[1]=0;
for(int i=0;i< a.length; i++) {
	if(i% 2==0)
	sum[0] = sum[0] + a[i];
	if(i%2==1)
		sum[1] = sum[1] + a[i];	
}
	
return sum;

}
