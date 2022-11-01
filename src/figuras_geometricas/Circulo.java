package figuras_geometricas;

public class Circulo implements FigurasGeometricas {

    private double raio;

    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String calcularArea() {

        return ("A área do Círculo é de " + Math.PI * Math.pow(raio,2));
    }
    
    public String calcularPerimetro() {

        return ("O perímetro do Circulo é " + 2 * Math.PI * raio);
    }

    public void desenharFiguraGeom() {

        System.out.println("Um círculo está sendo desenhado");
    }

    public void exibirInformações() {

        System.out.println("O raio do círculo é de " + raio + "\n" + calcularArea() + "\n" + calcularPerimetro() + "\n");
    }
}
