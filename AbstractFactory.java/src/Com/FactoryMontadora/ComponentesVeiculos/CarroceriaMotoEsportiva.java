package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.ICarroceria;

public class CarroceriaMotoEsportiva implements ICarroceria {
    public void exibirTipo() {
        System.out.println("Carroceria Esportiva");
    }
}

