package Ejercicio2;

public abstract class Empleado {
    
    public abstract double calcularSalario();
    
    public void mostrarSalario(){
        System.out.println("El salario total es: "+calcularSalario());
    }
    
}
