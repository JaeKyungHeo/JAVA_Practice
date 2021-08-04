package sec01.exam02;

public class booleanexample {

	public static void main(String[] args) {
		int[][] scores = {{95,92},{88,96,100}};

		for(int i=0;i<scores.length;i++) {
			for(int k=0;k<scores[i].length;k++) {
				System.out.printf("%d ", scores[i][k]);
			}
			System.out.printf("\n");
		}
	}

}
