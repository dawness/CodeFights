boolean almostIncreasingSequence(int[] sequence) {
/*    int size = sequence.length,k;
    boolean res= true;
    int[] seq = new int[size-1];
	
		for(int i=0; i < size; i++) {
			k=0;
			for( int j=0;j<size;j++)
		
		if( i==j) 
			continue;
		else {	
			seq[k]= sequence[j];
			k++; 
		}
		
			for(int m=0; m< size-2; m++)	{
			if(seq[m]>=seq [m+1]) {
					res=false;
					break;
				}
					else
						res=true;
				
					
			}
			if(res==true)
				break;
			
		}
	return res;*/
    
    int size= sequence.length,count=0;
		for(int i=0;i+1< size;i++) {
			
			if(sequence[i]>= sequence[i+1]) {
				count= count +1;
				if((i-1) >=0 && i+1 <size)
				if(sequence[i-1]<sequence[i+1]) {
					
					continue;
				}
				else{
					if(i+2<size)
					if(sequence[i] >= sequence[i+2]) {
						count=count+1;
					}
				}
			}
			
		}

		if(count==1)
			return true;
		else
			return false;

	}

