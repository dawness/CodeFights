boolean checkPalindrome(String inputString) {
    
    StringBuilder str = new StringBuilder();
    str.append(inputString);
    str.reverse();
     return(inputString.equalsIgnoreCase(str.toString()));
    

}
