package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main (String [] arg){
        System.out.println("Bienvenido a la Calculadora");
        Scanner teclado=new Scanner(System.in);
        int lado;
        System.out.print("DIgite cuantos lados tiene su figura geometrica:");
        lado=teclado.nextInt();
        System.out.println("Su figura es un cuadrado de : "+ lado +" lados");

    }
}
