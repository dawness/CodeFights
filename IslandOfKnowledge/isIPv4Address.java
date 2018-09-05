 boolean isIPv4Address(String inputString) {
	
	String[] str =inputString.split("\\.");
	boolean flag =true,flag1= true;
	
	
	if(str.length!= 4)
		flag=false;
	else {
	for(int i=0;i< str.length; i++) {
		if(str[i].matches("")) {
			flag=false;
			break;
		}
		for(char c: str[i].toCharArray()) {
			if( (c< '0') || (c>'9'))
				flag1 =false;
			
				
		}
			
		if(flag1 == false)	{
			flag=false;
			break;
		}
		else
		{
			
		if((Long.valueOf(str[i])>=0)  && (Long.valueOf (str[i]) <=255))
			flag=true;
		else {
			flag=false;
			break;
		}
		}
	}
	}
	
	return flag;

}

