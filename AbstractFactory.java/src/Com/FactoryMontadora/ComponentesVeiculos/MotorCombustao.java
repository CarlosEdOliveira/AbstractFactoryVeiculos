package Com.FactoryMontadora.ComponentesVeiculos;

import Com.FactoryMontadora.VeiculosInterface.IMotor;

public class MotorCombustao implements IMotor {
    public void exibirTipo() {
        System.out.println("Motor a Combustão");
    }
}