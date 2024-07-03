package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.IAssentos;

public class AssentosTecido implements IAssentos {
    public void exibirTipo() {
        System.out.println("Assentos de Tecido");
    }
}