package Com.FactoryMontadora.Factorys;

import Com.FactoryMontadora.ComponentesVeiculos.*;
import Com.FactoryMontadora.VeiculosInterface.IAssentos;
import Com.FactoryMontadora.VeiculosInterface.ICarroceria;
import Com.FactoryMontadora.VeiculosInterface.IMotor;
import Com.FactoryMontadora.VeiculosInterface.IRodas;
import Com.FactoryMontadora.VeiculosInterface.ISistemaEletrico;

public class FabricaMotos implements VeiculoFactory {
    public IMotor criarMotor() {
        return new MotorCombustao();
    }

    public ICarroceria criarCarroceria() {
        return new CarroceriaSedan();
    }

    public IRodas criarRodas() {
        return new RodasAro17();
    }

    public IAssentos criarAssentos() {
        return new AssentosTecido();
    }

    public ISistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoBasico();
    }
}