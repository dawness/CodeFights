int matrixElementsSum(int[][] matrix) {
int sum=0;
		int row= matrix.length;
		int col= matrix[0].length;
		for(int i=0;i<row;i++ ) {
			for(int j=0;j<col;j++) {
				if(matrix[i][j]==0) {
				for(int k=i;k<row;k++)	
				
				matrix[k][j]=0;
				}
				else
					sum= sum+ matrix[i][j];
			}
		}
		
return sum;
}
