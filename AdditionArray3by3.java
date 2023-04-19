package array;
//two Matrices Addition - 3*3
public class AdditionArray3by3 {
	public static void main(String[] args) {
		//creating matrix
		int a [][]= {{1,2,3},{4,5,7},{5,1,2}};
		int b [][]= {{1,5,3},{4,2,1},{1,1,2}};
		//for storing result creating another matrix
		int c[][]=new int[3][3]; // two row two column
		// logic and printing
		for (int i=0;i<3;i++) { // printing row
			for(int j=0;j<3;j++) { // printing column
				c[i][j] = a[i][j] + b[i][j]; // logic for matrix addition
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
