package friday16092022;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the size ");
		int size = input.nextInt();
		
		int[][]matrix = new int[size][size];
//		int k=1;
//		
//		for (int i=0; i<size;i++)
//		{
//			for (int j=0;j<size; j++)
//			{
//				matrix[i][j]=k;
//				k++;
//			}
//		}
		
		String traverse = "";
		traverse="right";
		int x=0,y=0, count=0, distance=size-1, edge=size-1;
		
		for (int i=1;i<=size*size;i++)
		{
			matrix[x][y]=i;
			
			switch (traverse)
			{
				case "right": 
					y+=1;
					break;
				case "down":
					x+=1;
					break;
				case "left":
					y-=1;
					break;
				case "up":
					x-=1;
					break;			
			}
			
		
			if (i==edge)
			{
				edge=edge+distance;
				
				if(count<1)
				{
					count++;
				}
				else
				{
					count=0;
					distance--;
				}
					switch (traverse)
					{
					case "right":
						traverse="down";
						break;
					case "down":
						traverse="left";
						break;
					case "left":
						traverse="up";
						break;
					case "up":
						traverse="right";
						break;
					}
			}
			
		}
		MatrixMultiplication.printMatrix(matrix);
		
	}

}
