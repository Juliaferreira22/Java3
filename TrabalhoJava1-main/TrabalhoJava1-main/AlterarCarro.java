import java.util.ArrayList;
import java.util.Scanner;

public class AlterarCarro {

 ArrayList<Carro> carros;
     Scanner sc = new  Scanner (System.in);

    public void alterar() {
        CarroController carroController = new CarroController();
        System.out.println("Qual posição você quer alterar: ");
        int posicao = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite os dados do carro atualizado:");
        for (Carro carroAlterado : carroController.alterar()){
        carros.get(posicao).setplaca(sc.nextLine()); 
        carros.get(posicao).setmarca(sc.nextLine()); 
        carros.get(posicao).setmodelo(sc.nextLine());
        carros.get(posicao).setmodelo(sc.nextLine());
        carros.get(posicao).setcor(sc.nextLine()); 
        carros.get(posicao).setvalor(sc.nextInt());

        System.out.println("Carro atualizado");
    }

}

public void apagar() {
        System.out.println("Qual posição você quer apagar: ");
        int posicao = sc.nextInt();

        carros.remove(posicao);
    }
    
}
