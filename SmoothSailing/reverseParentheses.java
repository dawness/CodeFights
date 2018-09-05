String reverseParentheses(String s) {
	int sta=0,en;
	int size= s.length();
    boolean p= true;
    while(p==true) {
    	p=false;
	for(int i=0;i< size;i++) {
		if(s.charAt(i)== '(') {
			sta=i;
			p=true;
		}
		if(s.charAt(i)==')') {
			en=i;
	StringBuilder  str= new StringBuilder();
	StringBuilder  st= new StringBuilder();
	st.append(s.substring(0, sta));
	str.append(s.substring(sta+1,en));
	st.append(str.reverse());
	st.append(s.substring(en+1, size));
	
	s= st.toString();
	size= s.length();
	System.out.println(s);
	break;
	}
		}	
    }
    return s;
}
