public class ListarCaminhao {
    public void listar(){
        CaminhaoController caminhaoController = new CaminhaoController();
        System.out.println("\n -- LISTAGEM DE CAMINHOES -- \n");
        for (Caminhao caminhaoCadastrado : caminhaoController.listar()){
            System.out.println(caminhaoCadastrado);
            System.out.println("Placa:" + caminhaoCadastrado.getplaca());
            System.out.println("Marca:" + caminhaoCadastrado.getmarca());
            System.out.println("Modelo:" + caminhaoCadastrado.getmodelo());
            System.out.println("Cor:" + caminhaoCadastrado.getcor());
            System.out.println("Valor:" + caminhaoCadastrado.getvalor());
            
            
           
        }
     }
}
