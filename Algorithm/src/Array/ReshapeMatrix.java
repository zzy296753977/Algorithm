package Array;
//If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; 
//Otherwise, output the original matrix.
public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		 int row = nums.length;
	        int column = nums[0].length;
			if(r*c!=row*column)
			return nums;
			//原始数组的第i行第j列
			int i = 0, j =0;
			//for循环构造新的矩阵r行，n列
			int [][] newM = new int[r][c];
			for(int m =0;m<r;m++)
			{
				for(int n=0;n<c;n++)
				{
					if(i<row&&j<column) 
	                {
						newM[m][n]=nums[i][j];
						j++;
						if(j==column)
						{
							i++;
							j=0;
						}
					}
				}
			}
			return newM;
    }
	
}
