package matriz;
import java.util.Scanner;
public class primera {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int matriz [][] = new int [3] [4];
	
	for(int i=0; i< 3; i++) { //esse la�o controla as linhas
		for(int j=0; j<4; j++) {//esse controla as colunas
			System.out.println("digite um numero para posi��o [" + i + "] ["+ j +"]: ");
			matriz [i] [j] = in.nextInt();
		}
	}
	for(int i=0; i <3; i++) {
		for(int j=0; j<4; j++) {
			System.out.print(matriz [i] [j]+" ");
		}
		System.out.println();
	}

	}

}
