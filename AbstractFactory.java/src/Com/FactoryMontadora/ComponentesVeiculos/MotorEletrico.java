package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.IMotor;

public class MotorEletrico implements IMotor {
    public void exibirTipo() {
        System.out.println("Motor Elétrico");
    }
}