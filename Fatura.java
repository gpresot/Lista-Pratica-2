import java.util.ArrayList;

public class Fatura {

   private ArrayList<Item> itens;
   private double valorTotal;
   
   public Fatura(){

    itens = new ArrayList<Item>();
    valorTotal = 0.0;
   }

   public void incluirItem(Item item){

        itens.add(item);

    }

    public void excluirItem(int index){

        itens.remove(index);

    }

    public void listarItens(){

        for(int i=0 ; i< itens.size() ; i++ ){

            System.out.println(itens.get(i).getProduto().getNome());

        }
    }

    public double getValorTotal(){

        double somaTot = 0;

        for(int i=0 ; i< itens.size() ; i++ ){

            somaTot += itens.get(i).getValorTotal();


        }

        return somaTot;
    }
    public void alterarQuantidade(int codigo, int novaQtd) {

    for (int i = 0; i < itens.size(); i++) {

        if (itens.get(i).getProduto().getCodigo() == codigo) {

            itens.get(i).setQuantidade(novaQtd);

        }
    }
}

}

