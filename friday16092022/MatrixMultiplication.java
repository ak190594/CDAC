package friday16092022;

public class MatrixMultiplication {
	
	
	static void printMatrix(int M[] [])
	{
		int row=M.length;
		int col=M[0].length;
		
		for (int i=0; i<row;i++) 
		{
			for(int j =0;j<col; j++)
			{
				if(M[i][j]<10) 
				{
					System.out.print(M[i][j]+"   ");
				}
				else if(M[i][j]<100) 
				{
					System.out.print(M[i][j]+"  ");
				}else if(M[i][j]<1000) 
				{
					System.out.print(M[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	 public static int[][] multiplyMatrix(int M1[][], int rowsize1, int colsize1, int M2[][], int rowsize2, int colsize2)
	 {
		 
		 int[][] result = new int[rowsize1][colsize2];
		 
		 for (int i=0; i<rowsize1; i++)
		 {
			 for (int j=0; j<colsize1;j++)
			 {
				 for (int k=0; k<rowsize2;k++)
				 {
				 result[i][j]+= M1[i][k]*M2[k][j];
				 }
			 }
		 }
		 
		 return result;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int matrix[][]= {{1, 2},
							{3, 4}};
			int matrix2[][]= {{4, 5},
							{6,7}};
			System.out.println("Matrix 1 is");
			printMatrix(matrix);
			
			System.out.println("Matrix 2 is");
			printMatrix(matrix2);
			
			
			 int rowsize1=matrix.length;
			 int colsize1=matrix[0].length;
			 
			 int rowsize2=matrix2.length;
			 int colsize2=matrix2[0].length;
			 
			 int result[][]= multiplyMatrix(matrix, rowsize1,colsize1, matrix2, rowsize2, colsize2);
			 
			System.out.println("Multiplication result is");

			 printMatrix(result);
			 
			
		}
}

