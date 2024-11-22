public class Automovil {
     private String fabricante;
     private String modelo;
    private String color="griss";
     private int capacidadTanque=40;
     private double cilindrada;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    // objeto que no retorna nada
    public  String  detalle(){
        // variable local
        //String modelo="otro";
        StringBuilder sb=new StringBuilder();
        sb.append("\n auto fabircante = " + this.fabricante);
        sb.append("\n auto modelo = " + this.modelo);
        //sb.append("auto modelo local = " + modelo);
        sb.append(" \n auto color = " + this.color);
        sb.append("\nauto cilindra = " + this.cilindrada);
        return sb.toString();
    }
    public  String revoluciones (int rpm){

        return " las revoliciones del auto son "  + this.fabricante +" " + rpm + "rpm";
    }
    public  String frenar(){
        return  this.fabricante + " "+ this.modelo + " frenando ";

    }
    public  String acelerarFrenar(int rpm){
         String acelerar= this.revoluciones(rpm);
         String frenar= this.frenar();
        return  acelerar + "\n" + frenar;
    }
    public  float calcularConsumo(int km,  float porcentajeConsumo){

        return  km/(this.capacidadTanque*porcentajeConsumo);
    }
    public  float calcularConsumo(int km,  int porcentajeConsumo){

        return  km/(this.capacidadTanque*(porcentajeConsumo/100f));
    }
}
