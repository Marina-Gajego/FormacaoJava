package exercicios.heranca;

public class cachorro extends animal{

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU");
    }

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
}
