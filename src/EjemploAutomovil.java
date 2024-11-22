public class EjemploAutomovil {

    public static void main(String[] args) {
       Automovil subaru=new Automovil();
       Automovil mazda=new Automovil();
       AutomovilElectrico autoElec= new AutomovilElectrico();
       subaru.fabricante="subaru";
       subaru.modelo="Impresa";
       subaru.cilindrada=2.0;

       mazda.fabricante="mazda";
       mazda.modelo="mazda 2";
       mazda.color="rojo diabloe";
       mazda.cilindrada=1.6;
       autoElec.marca="byd";
       autoElec.modelo="testter";
       autoElec.autonima="230km";


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());

        System.out.println(subaru.revoluciones(3000));
        System.out.println(subaru.frenar());
        System.out.println(subaru.acelerarFrenar(2000));
        System.out.println(autoElec.detalle());
        System.out.println(autoElec.aceleracion(300));
        System.out.println(autoElec.frenado());
        System.out.println(autoElec.aceleracionFrenado(5000));
    }


}
