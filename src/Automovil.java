public class Automovil {
    String fabricante;
    String modelo;
    String color="griss";
    double cilindrada;
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

}
