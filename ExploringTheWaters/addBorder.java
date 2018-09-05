String[] addBorder(String[] picture) {
int size= picture.length;
String[] newstr= new String[size+2];
int len = picture[0].length();
newstr[0]="";
newstr[size+1]="";
for(int i=0;i< len+2; i++)
	newstr[0]= newstr[0] + "*";
for(int i=0;i<size;i++) {
	newstr[i+1]= "*" + picture[i] + "*";
	
}
for(int i=0;i< len+2; i++)
	newstr[size+1]= newstr[size+1] + "*";


return newstr;

}
