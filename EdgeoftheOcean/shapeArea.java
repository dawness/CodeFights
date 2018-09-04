int shapeArea(int n) {
    int area,num,number=1;
		num= (n+n-1);
		int sum=0;
    while(number !=num) {
			sum= sum + number;
			number= number +2;
			
		}
		return (num +2*sum);

}
