package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaSUV implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria SUV");
    }
}