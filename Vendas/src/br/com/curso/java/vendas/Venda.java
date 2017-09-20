package br.com.curso.java.vendas;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ben10debian
 */
public class Venda {

    List<ItemVenda> itens = new ArrayList<>();
 
    
    public void adicionar(ItemVenda itemVenda) {
        
       
        if(itemVenda == null){
            
            throw new IllegalArgumentException("item não pode ser nulo");

            //throw new VendaException(500, "item não pode ser nulo!");

        }
        
        itens.add(itemVenda);
        
    }

    
    public void getNomeDoItem(){
              
        for(ItemVenda item : itens){
             
            System.out.println(item.getDescricao());
        
        }     
    }
    
    
     public double getTotal() {
        
        double total = 0;
        
        for(ItemVenda item : itens){
                    
            total += item.getPreco();
        }
        
        return total;
    }
    
}
