package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaSedan implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria Sedan");
    }
}
