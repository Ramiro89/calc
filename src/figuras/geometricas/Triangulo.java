package figuras.geometricas;

public class Triangulo {
    private final int idTriangulo = 1;
    private float lado1;
    private float lado2;
    private float lado3;
    private String color;
    private static int contTriangulos;

    private Triangulo(){
        contTriangulos++;
    }
    public Triangulo(float lado1, float lado2, float lado3,String color) {
        this();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color= color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float area(){
       System.out.println("Este metodo calcula el area");
       return lado1+lado2+lado3;
    }

    public int getIdTriangulo() {
        return idTriangulo;
    }


    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "idTriangulo=" + idTriangulo + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
}
