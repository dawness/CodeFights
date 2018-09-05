boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
AddTwoArms arm = (int a,int b) -> a==b;
	if( arm.comp(yourLeft, friendsLeft) && arm.comp(yourRight, friendsRight))
			return true;
	else if (arm.comp(yourLeft, friendsRight) && 	arm.comp(yourRight, friendsLeft))
	
			return true;
	
	else
	return false;

    
    
}

interface AddTwoArms{
	public boolean comp(int a, int b);
}
