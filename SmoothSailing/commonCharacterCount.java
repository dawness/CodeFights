int commonCharacterCount(String s1, String s2) {
int sizes1=s1.length();
		int sizes2=s2.length();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count=0;
			for(int i=0;i<sizes1;i++) {
			
			for(int j=0;j<sizes2;j++) {
				if(list.contains(j) )
					continue;
				else if(s1.charAt(i)== s2.charAt(j)) {
				count= count+1;
				list.add(j);
				break;
			}
				
			}
		}

	return count;

}
