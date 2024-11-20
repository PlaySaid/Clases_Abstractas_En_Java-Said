public class Ejecucion {

    public static void main(String[] args) {
        
        Rectangulo rect = new Rectangulo(10,7);
        Circulo circu = new Circulo(7.0);
        
        System.out.println("El area del rectangulo es "+rect.calcularArea());
        System.out.println("El area del circulo es "+circu.calcularArea());
        
    }   
}
