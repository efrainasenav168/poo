public class AutomovilElectrico {

    String marca;
    String modelo;
    String autonima;

    public  String detalle(){
            StringBuilder sb= new StringBuilder();
                sb.append("marca" + this.marca);
                sb.append("modelo" + this.modelo);
                sb.append("autonomia" + this.autonima);

        return  sb.toString();
    }
    public  String aceleracion ( int rpm){

        return " el automovil electrio " +" "+this.marca + " "+ "tiene una acelarion de" + " "+ rpm+"rpm" ;
    }
    public  String frenado(){
        return " el auto electrico " + " " + this.modelo + " "+ "esta frenando";
    }
    public  String  aceleracionFrenado(int rpm){
        String aceleracion= this.aceleracion(rpm);
        String frenado= this.frenado();
        return  aceleracion + "\n" + frenado;
    }

}
