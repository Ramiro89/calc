package prueba.link;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        int id;
        String color;

      System.out.println("*************************");
      System.out.println("         MENU            ");
      System.out.println("*************************");
      System.out.println("");
      System.out.println("Presione el número de la opción deseada:");
      System.out.println("");
      System.out.println("1. Crear Figura Geometrica");
      System.out.println("2. Listar figuras geometricas");
      opcion=teclado.nextInt();

      if (opcion==1) {
          System.out.println("1-Introdusca el ID:");
          id = teclado.nextInt();
          System.out.println("usted creo una figura geometrica con id: " + id);
      }else
              if (opcion==2)
              {
                  System.out.println("Este es el listado de figuras");
                  System.out.println("Cuadrado, Rectangulo, Triangulo");}
                  else{
                    System.out.println("Solo puede insertar 2 numeros: 1 ó 2");
              }
      }




        /*  FiguraGeometrica figura;

        figura = new Circulo(5);

        System.out.println(figura.getClass());

        System.out.println("Area: "+figura.getArea());

        System.out.println("Perimetro: "+figura.getPerimetro());

        figura = new Cuadrado(5);

        System.out.println(figura.getClass());

        System.out.println("Area: "+figura.getArea());

        System.out.println("Perimetro: "+figura.getPerimetro());

        figura = new Rectangulo(5,2);

        System.out.println(figura.getClass());

        System.out.println("Area: "+figura.getArea());

        System.out.println("Perimetro: "+figura.getPerimetro());

        figura = new Triangulo(5,2);

        System.out.println(figura.getClass());

        System.out.println("Area: "+figura.getArea());

        System.out.println("Perimetro: "+figura.getPerimetro());

        figura = new Cubo(5);

        System.out.println(figura.getClass());

        System.out.println("Area: "+figura.getArea());

        System.out.println("Perimetro: "+figura.getPerimetro());*/

    }
