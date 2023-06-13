//Classe de modelo
public class Automovel {

    private String placa;
    private Marcas marca;
    private String modelo;
    private String cor;
    private int valor;
    

    // Métodos de acesso ao atributo NOME
    public void setplaca(String placa) {
        this.placa = placa;
    }

    public String getplaca() {
        return  this.placa;
    }

    public void setmarca(Marcas marca) {
        this.marca = marca;
    }

    public Marcas getmarca() {
        return this.marca;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getcor() {
        return this.cor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }

    public int getvalor() {
        return this.valor;
    }


    public void cadastrar(){

    }

    // public void imprimir_enum(){
    //     for (cor_ano cor_ano : cor_ano.values()){
    //         System.out.println("Cor:" + cor_ano.getcor());
    //         System.out.println("Ano:" + cor_ano.getano()); 
                   
    //     }
    // }

    public Automovel(String placa , Marcas marca, String modelo, String cor, int valor){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor; 

         
    }

    public Automovel(){
        
    }

    public void imprimirDados() {
        System.out.print(placa + ' ' + marca + " " + modelo+ " " + cor+ " " + valor);
        System.out.println();
    }

   
}


