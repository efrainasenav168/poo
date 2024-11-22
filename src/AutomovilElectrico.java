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

}
