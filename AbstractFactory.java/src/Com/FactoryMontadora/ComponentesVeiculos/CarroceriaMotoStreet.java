package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaMotoStreet implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria Street");
    }
}