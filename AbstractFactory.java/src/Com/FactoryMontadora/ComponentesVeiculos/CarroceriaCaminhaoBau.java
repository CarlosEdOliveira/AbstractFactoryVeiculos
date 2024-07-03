package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaCaminhaoBau implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria caminhão baú");
    }
}
