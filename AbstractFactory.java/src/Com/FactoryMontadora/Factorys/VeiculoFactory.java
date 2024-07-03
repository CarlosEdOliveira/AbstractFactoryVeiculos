package Com.FactoryMontadora.Factorys;

import Com.FactoryMontadora.VeiculosInterface.*;
import Com.FactoryMontadora.VeiculosInterface.IAssentos;
import Com.FactoryMontadora.VeiculosInterface.ICarroceria;
import Com.FactoryMontadora.VeiculosInterface.IMotor;
import Com.FactoryMontadora.VeiculosInterface.IRodas;
import Com.FactoryMontadora.VeiculosInterface.ISistemaEletrico;

public interface VeiculoFactory {
    IMotor criarMotor();
    ICarroceria criarCarroceria();
    IRodas criarRodas();
    IAssentos criarAssentos();
    ISistemaEletrico criarSistemaEletrico();
}