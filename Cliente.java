public class Cliente {
    private String nome;
    private int idade;
    private double renda;

    public Cliente(String nome, int idade, double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String classificarIdade() {
        if (idade >= 18) {
            return "O cliente " + nome + " está com " + idade + " anos de idade sendo, portanto, maior de idade. ";
        } else{
            return "O cliente " + nome + " está com " + idade + " anos de idade sendo, portanto, menor de idade. ";
        }
    }

    public String classificarRenda(){
        if(renda>=15000){
            return "Com a sua renda de R$"+ renda + " é considerado(a) classe alta.";
        }else{
            return "Com a sua renda de R$"+ renda + " é considerado(a) classe média.";
        }
    }
}