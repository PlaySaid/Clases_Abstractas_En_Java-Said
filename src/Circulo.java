public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(double radio){
    this.radio = radio;
    }

    //Metodo para sobreescribir el metodo abstracto de la clase padre
    @Override
         public double calcularArea(){
         return Math.PI*(radio * radio);
        }
}