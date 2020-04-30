public class Numero {
    private int valor;

    public Numero(int valor){
        this.valor=valor;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor=valor;
    }

    public String testarNumero(){
        String teste;
        if(valor!=0){
            if(valor>0) {
                teste = "O número " + valor + " é positivo.";
            }
            else {
                teste="O número " + valor + " é negativo.";
            }
        } else {
            teste="O número " + valor + " é nulo.";
        }
        return teste;
    }

    public int calcularFatorial(){
        int fatorial=valor;
        for(int aux=valor-1; aux>1; aux--){
            fatorial=fatorial*aux;
        }
        return fatorial;
    }
}
