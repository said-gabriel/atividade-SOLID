package LSP_INCORRETO;

public class Retangulo {

    private double altura;
    private double largura;
    private double area;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.area = calculaArea();
    }

    private double calculaArea() {
        setArea(getAltura() * getLargura());
        return getArea();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
