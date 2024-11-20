package Ejercicio2;

public class Gerente extends Empleado{
    
    private double salario;
    
    public Gerente(double salario){
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
