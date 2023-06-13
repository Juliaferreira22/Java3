import java.util.ArrayList;
public class CarroController {

    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public void cadastrar(Carro carro) {
        carros.add(carro);
    }

    public ArrayList<Carro> listar() {
        return carros;
    }

    public ArrayList<Carro> alterar(){
        return carros;
    }

    public void buscarPorMarca(Marcas marca){
        for (Carro carroCadastrado : carros) {
            if(carroCadastrado.getmarca() ==  marca){
                System.out.println("Placa:" + carroCadastrado.getplaca());
                System.out.println("Marca:" + carroCadastrado.getmarca());
                System.out.println("Modelo:" + carroCadastrado.getmodelo());
                System.out.println("Cor:" + carroCadastrado.getcor());
                System.out.println("Valor:" + carroCadastrado.getvalor());
               

            }
            
        }
}



}
