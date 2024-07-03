package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaMotoNaked implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria Naked");
    }
}