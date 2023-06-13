public class ListarMoto {

    public void listar(){
        MotoController motoController = new MotoController();
        System.out.println("\n -- LISTAGEM DE MOTOS -- \n");
        for (Moto motoCadastrado : motoController.listar()){
            System.out.println(motoCadastrado);
            System.out.println("Placa:" + motoCadastrado.getplaca());
            System.out.println("Marca:" + motoCadastrado.getmarca());
            System.out.println("Modelo:" + motoCadastrado.getmodelo());
            System.out.println("Cor:" + motoCadastrado.getcor());
            System.out.println("Valor:" + motoCadastrado.getvalor());
            
            
           
        }
     }
    
}
