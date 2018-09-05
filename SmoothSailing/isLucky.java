boolean isLucky(int n) {
int len= String.valueOf(n).length();
	int sum1=0,sum2=0;

	for(int i=0;i< len/2; i++) {
		 sum1=sum1+ n % 10;
		 n= n /10;
	}
	for( int i= 0;i<len/2;i++) {
		sum2= sum2+ n % 10;
	    n= n /10;
	}
	    
	if( sum1==sum2)
	return true;
	else
	return false;
	}


