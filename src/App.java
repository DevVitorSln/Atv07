import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        
        Scanner scanner = new Scanner(System.in);
 
        double valorLadoQuadrado, AreaQuadrado;

        System.out.println("Informe o valor de um lado do quadrado: ");
        valorLadoQuadrado = scanner.nextDouble();

        AreaQuadrado = valorLadoQuadrado * valorLadoQuadrado;

        System.out.println("O Dobro da área deste quadrado é: " + AreaQuadrado * 2);
    }
}
