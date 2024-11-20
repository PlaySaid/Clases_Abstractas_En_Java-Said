package Ejercicio2;

public class Vendedor extends Empleado{
    
    private double salario,bonoVentas;
    
    public Vendedor(double salario, double bonoVentas){
        this.salario = salario;
        this.bonoVentas = bonoVentas;
    }
    
    @Override
    public double calcularSalario(){
        return salario+bonoVentas;
    }
    
}
