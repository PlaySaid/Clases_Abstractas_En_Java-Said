package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        ClaseHija instancia = new ClaseHija();
        
        instancia.metodoAbstracto();
        System.out.println(instancia.metodoConcreto());
        
    }
    
}
