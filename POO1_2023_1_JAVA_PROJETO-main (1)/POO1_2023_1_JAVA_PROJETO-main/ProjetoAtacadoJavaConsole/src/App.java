import java.time.LocalDate;

import br.com.atacado.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        PessoaFisica p1 = new PessoaFisica(1, "Mateus", "mateus@ceu.com.br", "ceu.com.br", LocalDate.now(), "123",
                "456", "M", "Parda", "Hebreu", "Jerusalem", "Pai do Mateus", "Mãe do Mateus");

        // p1.Imprimir();
        System.out.println(p1.toString());

        System.out.println("----------------------------------------------------------------------------------");

        PessoaJuridica pj1 = new PessoaJuridica(2, "ACME LTDA", "gerente@acme.com.br", "acme.com.br", LocalDate.now(),
                "123456", "963852741", "741852963", "Pipiu e Frajola Bar e Lanches");

        // pj1.Imprimir();
        System.out.println(pj1.toString());
    }
}
