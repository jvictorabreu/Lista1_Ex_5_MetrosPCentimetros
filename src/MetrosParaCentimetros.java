import java.util.Scanner;

// 5- Faça um Programa que converta metros para centímetros.

public class MetrosParaCentimetros {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite a medida em metros: ");
        double m = userInput.nextDouble();

        double cm = m * 100;

        System.out.println(m + "m equivalem a " + cm + "cm");
    }
}