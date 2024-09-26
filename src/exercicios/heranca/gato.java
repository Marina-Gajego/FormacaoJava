package exercicios.heranca;

public class gato extends animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    public void aranharMoveis(){
        System.out.println("Arranhando moveis");
    }
}

