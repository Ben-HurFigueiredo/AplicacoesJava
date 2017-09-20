package br.com.curso.java.vendas;

/**
 *
 * @author ben10debian
 */

public class Main {

    public static void main(String args[]) {

       try{
       ItemVenda camisa = new ItemVenda();
       camisa.setDescricao("Camisa Polo");
       camisa.setPreco(30.0);
       
       
       ItemVenda sapato = new ItemVenda();
       sapato.setDescricao("Sapato Adidas");
       sapato.setPreco(210.0);
       
       
       Venda venda = new Venda();
       //venda.adicionar(null);
       venda.adicionar(camisa);
       venda.adicionar(sapato);
       
                 
               
       venda.getNomeDoItem();
       System.out.println("Resultado: Total de vendas: " + venda.getTotal());
       
       }catch(NullPointerException e){
           
           e.printStackTrace();
           System.out.println("Erro ao preocessar " );
           
           
       } finally{
           
           
           System.out.println("FIM!");
           
           
       }
        
    }
    
}
