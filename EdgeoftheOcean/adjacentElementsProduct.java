int adjacentElementsProduct(int[] inputArray) {
int product, prod;
		int size= (inputArray.length)- 1;
    product= inputArray[0] * inputArray[1];
		for(int i=1;i< size; i++) {
			prod =inputArray[i] * inputArray[i+1];
			if(product < prod)
				product = prod ;
			
			}
		return product;

}
