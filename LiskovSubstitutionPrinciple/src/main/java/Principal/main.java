package Principal;

import LSP_CORRETO.Paralelogramo;
import LSP_CORRETO.QuadradoNovo;
import LSP_CORRETO.RetanguloNovo;
import LSP_INCORRETO.Quadrado;
import LSP_INCORRETO.Retangulo;

public class main {

    public static void main(String[] args) {
        //maneira incorreta
        Retangulo ret = new Retangulo(17, 15);
        Quadrado quad = new Quadrado(17, 15);
        /*Quadrado e retangulo apesar de dados iguais
        tem regras diferentes para seus calculos, por isso
        um retangulo nao representa um quadrado*/
        System.out.printf("Forma incorreta: \nRetangulo area: " + ret.getArea()
                + "\nQuadrado area:" + quad.getArea());
        //maneira correta
        Paralelogramo retNovo = new RetanguloNovo(20, 15);
        //Paralelogramo quadNovo = new QuadradoNovo(20, 25); //nao ira compilar
        Paralelogramo quadNovo = new QuadradoNovo(20, 20);
        System.out.printf("\nForma correta: \nRetangulo area: " + retNovo.getArea()
                + "\nQuadrado area:" + quadNovo.getArea());
    }

}
