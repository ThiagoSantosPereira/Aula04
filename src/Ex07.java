import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int numero=1238;		
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		contador = leitor.nextInt();
		
		while (contador != numero) {
			System.out.println("Errroouuu, digite outro n�mero:");
			contador = leitor.nextInt();
				
		}
		System.out.println("N�mero correto! Parabens!");
		leitor.close();
	}

}
