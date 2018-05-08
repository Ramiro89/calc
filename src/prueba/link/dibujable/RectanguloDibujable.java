package prueba.link.dibujable;

import prueba.link.Rectangulo;

import java.awt.*;

public class RectanguloDibujable extends Rectangulo implements FiguraDibujable {
    private int x;
    private int y;

    public RectanguloDibujable(double valor1, double valor2, int x, int y) {

        super(valor1, valor2);
        this.x = x;
        this.y = y;
    }
    @Override
    public void setCoordenadas(int x, int y) {
        this.x=x;
        this.y=y;

    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawOval(this.x, this.y, (int)this.valor1, (int)this.valor2);
    }
}
