package figuras_geometricas;

public class Retangulo implements FigurasGeometricas {
    
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public String calcularArea() {

        return ("A área do retângulo é de " + (ladoA * ladoB));
    }
    
    public String calcularPerimetro() {

        return ("O perímetro do retângulo é de " + ((ladoA * 2) + (ladoB * 2)));
    }

    public void desenharFiguraGeom() {

        System.out.println("Um retângulo está sendo desenhado");
    }

    public void exibirInformações() {

        System.out.println("Os lados do retângulo têm valor " + ladoA + " e " + ladoB + "\n" + calcularArea() + "\n" + calcularPerimetro() + "\n");
    }
}
