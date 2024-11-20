public class Rectangulo extends Figura{
        
    private double largo,ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //Metodo para sobreescribir el metodo abstracto de la clase padre
    @Override
        public double calcularArea(){
        return largo * ancho;
       }
    
}