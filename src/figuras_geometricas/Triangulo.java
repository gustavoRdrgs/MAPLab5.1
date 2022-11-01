package figuras_geometricas;

public class Triangulo implements FigurasGeometricas{
    
    private String tipo;
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private int anguloAB;
    private int anguloAC;
    private int anguloBC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC, int anguloAB, int anguloAC,
            int anguloBC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.anguloAB = anguloAB;
        this.anguloAC = anguloAC;
        this.anguloBC = anguloBC;

        //Aqui ocorre a validação do tipo do triângulo a partir de características

        //Se um dos ângulos é de 90°, fica como triângulo retângulo
        if ((anguloAB == 90) || (anguloAC == 90) || (anguloBC == 90)) {
            this.tipo = "retângulo";

        //Se dois lados apenas são iguais, fica como triângulo isósceles
        } else if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB) || (ladoB == ladoC && ladoB != ladoA)) {
            this.tipo = "isósceles";

        //Se os três lados são iguais, fica como triângulo equilátero
        } else if (ladoA == ladoB && ladoB == ladoC) {
            this.tipo = "equilátero";

        /*Caso não se encaixe em nenhum, o valor fica nulo, visto que existem outros tipos de
        triângulos que não são pedidos na questão*/
        } else {
            this.tipo = "";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public int getAnguloAB() {
        return anguloAB;
    }

    public void setAnguloAB(int anguloAB) {
        this.anguloAB = anguloAB;
    }

    public int getAnguloAC() {
        return anguloAC;
    }

    public void setAnguloAC(int anguloAC) {
        this.anguloAC = anguloAC;
    }

    public int getAnguloBC() {
        return anguloBC;
    }

    public void setAnguloBC(int anguloBC) {
        this.anguloBC = anguloBC;
    }
    
    public void desenharFiguraGeom() {
        System.out.println("Um triângulo " + tipo + "está sendo desenhado");
    }

    public String calcularArea() {

        return ("A área do triângulo " + tipo + " é de " + ((base * altura) / 2));
    };

    public String calcularPerimetro() {

        return ("O perímetro do triângulo " + tipo + " é de " + (ladoA + ladoB + ladoC));
    }

    public void exibirInformações() {

        System.out.println("Os lados do triângulo " + tipo + " têm valor " + ladoA +", "+ ladoB +" e "+ ladoC + 
                            "\nA altura tem valor " + altura + "\nA base tem valor " + base + 
                            "\n" + calcularArea() + "\n" + calcularPerimetro() + "\n");
    }
}
