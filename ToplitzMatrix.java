//Given a N*N Matrix i want to find wether it is toplitz or not .



public class ToplitzMatrix

{

  public boolean isToplitzMatrix(int[][] matrix)
{
  for(int row=0;row<matrix.length-1;row++)
  {
  	for(int col=0;col<matrix[row].length-1;col++)
  	{
      if(matrix[row][col] != matrix[row+1][col+1])
      	return false;
  	}
  }
  return true;
} 

  public static void main(String[] args)
  {
  	ToplitzMatrix toplitzMatrix=new ToplitzMatrix();

  	int[][] testcase1={{1,2,3},{4,5,6},{7,8,9}};

  	int[][] testcase2={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
  	System.out.println("case 1 matrix a ToplitzMatrix :" +toplitzMatrix.isToplitzMatrix(testcase1));
  	System.out.println("case 1 matrix a ToplitzMatrix :" +toplitzMatrix.isToplitzMatrix(testcase2));
  }
}