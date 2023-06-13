public class ListarCarro {
    public void listar(){
        CarroController carroController = new CarroController();
        System.out.println("\n -- LISTAGEM DE CARROS -- \n");
        for (Carro carroCadastrado : carroController.listar()){
            System.out.println(carroCadastrado);
            System.out.println("Placa:" + carroCadastrado.getplaca());
            System.out.println("Marca:" + carroCadastrado.getmarca());
            System.out.println("Modelo:" + carroCadastrado.getmodelo());
            System.out.println("Cor:" + carroCadastrado.getcor());
            System.out.println("Valor:" + carroCadastrado.getvalor());
            
            
           
        }
     }
    
}
