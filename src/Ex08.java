import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		Double media;
		Double nota;
		int aluno=0;
		int maior=0;
		int menor=0;
		
		System.out.println("Digite a média da sala");
		Scanner leitor = new Scanner(System.in);
		media = leitor.nextDouble();
		
		while (aluno<50) 
		
	{
			
		System.out.println("Digite a média do aluno" + aluno);
		nota = leitor.nextDouble();
		if (nota < media) { menor = menor + 1;
				} else {maior = maior + 1;}
			
		aluno = aluno + 1;
		
		}
		leitor.close();
		System.out.println("Abaixo da média: " + menor);
		System.out.println("Abaixo da média: " + maior);
	}

}
