package Ejercicio2;

public class Ejecucion {

    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente(5000000);
        System.out.println("----------GERENTE-----------");
        gerente1.mostrarSalario();
        
        Vendedor vendedor1 = new Vendedor(2000000,500000);
        System.out.println("----------VENDEDOR-----------");
        vendedor1.mostrarSalario();
        
    }
    
}
