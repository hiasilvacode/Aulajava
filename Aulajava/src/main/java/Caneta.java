public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void rabiscar (){
        if(tampada == true){
        System.out.println("Rabiscar");}

        else {
            System.out.println("Hora de rabiscar!");
    }

    }
    void tampar (){
        tampada = true;

    }
    void destampar(){
        tampada = false;
    }
    void estado(){
        System.out.println("Esta caneta e do modelo " + modelo);
        System.out.println("Esta caneta e da cor " + cor);
        System.out.println("Esta caneta e da ponta " + ponta);
        System.out.println("Esta caneta e da carga " + carga);
        System.out.println("Esta caneta e da tampada? " + tampada);
    }
}

