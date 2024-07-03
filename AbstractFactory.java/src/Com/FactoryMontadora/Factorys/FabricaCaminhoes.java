package Com.FactoryMontadora.Factorys;

import Com.FactoryMontadora.ComponentesVeiculos.*;
import Com.FactoryMontadora.VeiculosInterface.IAssentos;
import Com.FactoryMontadora.VeiculosInterface.ICarroceria;
import Com.FactoryMontadora.VeiculosInterface.IMotor;
import Com.FactoryMontadora.VeiculosInterface.IRodas;
import Com.FactoryMontadora.VeiculosInterface.ISistemaEletrico;

public class FabricaCaminhoes implements VeiculoFactory {
    public IMotor criarMotor() {
        return new MotorCombustao();
    }

    public ICarroceria criarCarroceria() {
        return new CarroceriaSUV();
    }

    public IRodas criarRodas() {
        return new RodasAro20();
    }

    public IAssentos criarAssentos() {
        return new AssentosCouro();
    }

    public ISistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoAvancado();
    }
}