public class TesteCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "esferografica";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
      /*  caneta1.tampada = false; */


        caneta1.tampar();
        caneta1.rabiscar();
        caneta1.estado();

        System.out.println("------------------------------------");

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "esferografica";
        caneta2.cor = "rosa";
        caneta2.ponta = 0.5f;
        caneta2.carga = 90;
        caneta1.tampada = false;

        caneta2.tampar();
        caneta2.rabiscar();
        caneta2.estado();

    }
}
