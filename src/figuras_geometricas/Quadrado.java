package figuras_geometricas;

public class Quadrado implements FigurasGeometricas {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Quadrado(double d) {
        this.lado = d;
    }

    public String calcularArea() {

        return ("A área do quadrado é de " + (lado * lado));
    }
    
    public String calcularPerimetro() {

        return ("O perímetro do quadrado é de " + (lado * 4));
    }

    public void desenharFiguraGeom() {

        System.out.println("Um quadrado está sendo desenhado");
    }

    public void exibirInformações() {

        System.out.println("Os lados do quadrado têm valor " + lado + "\n" + calcularArea() + "\n" + calcularPerimetro() + "\n");
    }
}
