package completo.exStatic;

public class Contador {
    private static int contador;

    public Contador(){
        Contador.contador++;
    }

    static void exibirContador(){
        System.out.printf("\nFoi intanciado: %d x", contador );
    }
}
