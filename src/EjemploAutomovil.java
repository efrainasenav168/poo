public class EjemploAutomovil {

    public static void main(String[] args) {
       Automovil subaru=new Automovil();
       Automovil mazda=new Automovil();
       subaru.fabricante="subaru";
       subaru.modelo="Impresa";
       subaru.cilindrada=2.0;

       mazda.fabricante="mazda";
       mazda.modelo="mazda 2";
       mazda.color="rojo diabloe";
       mazda.cilindrada=1.6;


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());

        System.out.println(subaru.revoluciones(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(2000));

    }


}
