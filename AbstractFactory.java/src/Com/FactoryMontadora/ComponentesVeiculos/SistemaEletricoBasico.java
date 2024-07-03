package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ISistemaEletrico;

public class SistemaEletricoBasico implements ISistemaEletrico {
    public void exibirTipo() {
        System.out.println("Sistema Elétrico Básico");
    }
}
