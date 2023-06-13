import java.util.Scanner;

public class CadastrarCaminhao {
public void cadastrar(){
        Scanner sc = new  Scanner (System.in);

        Caminhao caminhao = new Caminhao();
        CaminhaoController caminhaoController = new CaminhaoController();

        System.out.println("\n -- CADASTRO DE CAMINHOES -- \n");

        System.out.println("Digite a placa do caminhao: ");
        String placa = sc.nextLine(); 
        caminhao.setplaca(placa);

        System.out.println("Digite a marca do caminhao: ");
        String marca = sc.nextLine(); 
        Marcas v_3 = Marcas.valueOf(marca);
        caminhao.setmarca(v_3);


        System.out.println("Digite a modelo do caminhao: ");
        String modelo = sc.nextLine();
        caminhao.setmodelo(modelo);

        System.out.println("Digite a cor do caminhao: ");
        String cor = sc.nextLine();
        caminhao.setcor(cor);

        System.out.println("Digite o valor do caminhao: ");
        int valor = sc.nextInt();
        caminhao.setvalor(valor);

        caminhaoController.cadastrar(caminhao);

        System.out.println("---CAMINHÃO CADASTRADO----");

    }
    
}
