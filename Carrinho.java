import java.util.ArrayList;
import java.util.Scanner;
public class Carrinho {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 101, 25.50));
        produtos.add(new Produto("Feijão", 102, 8.90));
        produtos.add(new Produto("Leite", 103, 5.50));

        Fatura fatura = new Fatura();

        int op = 0;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Excluir item");
            System.out.println("4 - Alterar item");
            System.out.println("5 - Finalizar");
            System.out.println("Escolha uma opção: ");
            op = scanf.nextInt();

            switch (op){
                case 1:
                    for (int i = 0; i < produtos.size(); i++) {

                    System.out.println(
                    produtos.get(i).getCodigo() + " - " +
                    produtos.get(i).getNome() + " - R$ " +
                    produtos.get(i).getPreco()
                    );
                    }

                    System.out.println("Digite o Codigo do produto que deseja comprar: ");
                    int codigo = scanf.nextInt();

                    System.out.println("Digite a Quantidade do produto que deseja comprar: ");
                    int qtd = scanf.nextInt();

                    for (int i = 0; i < produtos.size(); i++){

                        if (codigo == produtos.get(i).getCodigo()){

                            Item item = new Item(produtos.get(i),qtd);

                            fatura.incluirItem(item);
                        }
                    }
                    break;


                case 2:

                    fatura.listarItens();
                    System.out.printf("R$%.2f", fatura.getValorTotal());
                    break;
            
                case 3:
                    System.out.println("Em qual posicao o produto que deseja retirar esta? ");
                    fatura.excluirItem(scanf.nextInt());
                    break;

                case 4:

                    fatura.listarItens();

                    System.out.println("Código do produto que deseja alterar: ");
                    int codigoAlterar = scanf.nextInt();

                    System.out.println("Nova quantidade:");
                    int novaQtd = scanf.nextInt();

                    fatura.alterarQuantidade(codigoAlterar, novaQtd);

                    break;
            
                case 5:
                    System.out.printf("R$%.2f", fatura.getValorTotal());
                    break;
            
                default:
                    break;
            }
        
        }while(op!=5);
    }

}
