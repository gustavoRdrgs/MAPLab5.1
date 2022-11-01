import figuras_geometricas.Circulo;
import figuras_geometricas.Quadrado;
import figuras_geometricas.Retangulo;
import figuras_geometricas.Triangulo;

public class App {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(5, 4, 3, 2, 2, 90, 45, 45);
        Quadrado quadrado = new Quadrado(20);
        Retangulo retangulo = new Retangulo(12, 24);
        Circulo circulo = new Circulo(4);

        triangulo.exibirInformações();
        quadrado.exibirInformações();
        retangulo.exibirInformações();
        circulo.exibirInformações();

    }
}
