public class Cachorro{
    private String nome;
    private int idade;
    private double peso;
    private boolean adotado; 

    public Cachorro(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.adotado = false;
    }
    //Métodos
    public void alimentarCachorro(double quantidade){
        this.peso+= quantidade*0.1;
    }

    public void exercitarCachorro(double distancia){
        this.peso-= distancia*0.05;
    }


    //Getter and Setter Nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //Getter and Setter Idade
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    //Getter and Setter Peso
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    //Getter and Setter Adotado
    public boolean ehAdotado(){
        return this.adotado;
    }
    public void setAdotado(boolean adotado){
        this.adotado = adotado;
    }

   
}