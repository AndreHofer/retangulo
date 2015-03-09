import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in); 
		Retangulo ret1;
		ret1= new Retangulo();
		System.out.print("Digite a largura: ");
		ret1.largura = scanner.nextDouble();
		System.out.print("Digite o comprimento: ");
		ret1.comprimento = scanner.nextDouble();
		ret1.retangulo();
		System.out.println("Area:"+ret1.area+"\nPerimetro:"+ret1.perimetro);
	}
}
