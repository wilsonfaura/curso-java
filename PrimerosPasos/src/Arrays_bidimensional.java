
public class Arrays_bidimensional {

	public static void main(String[] args) {
		int [][] matrix=new int[4][5];
		matrix[0][0]=15;
		matrix[0][1]=12;
		matrix[0][2]=9;
		matrix[0][3]=125;
		matrix[0][4]=135;
		
		matrix[1][0]=1;
		matrix[1][1]=22;
		matrix[1][2]=92;
		matrix[1][3]=35;
		matrix[1][4]=11;
		
		matrix[2][0]=5;
		matrix[2][1]=12;
		matrix[2][2]=9;
		matrix[2][3]=2;
		matrix[2][4]=65;
		
		matrix[3][0]=10;
		matrix[3][1]=7;
		matrix[3][2]=9;
		matrix[3][3]=11;
		matrix[3][4]=115;
		
		for(int i=0; i<4; i++) {
			System.out.println(" ");
			for (int j=0; j<5; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		/*------------------------------------------*/
		System.out.println(" ");
		int [][]matrix2= {
				{15,25,68,47,85},
				{23,254,15,18,6},
				{17,25,47,15,14},
				{2,6,124,148,967}
		};
		
		for(int i=0; i<4; i++) {
			System.out.println(" ");
			for (int j=0; j<5; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
		}		
		System.out.println(" ");
		
		for(int[]fila:matrix2) {
			System.out.println();
			for ( int z:fila) {
				System.out.print(z + " ");
			}
		}
		
	}
}
