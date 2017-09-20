package br.com.curso.java.vendas;

/**
 *
 * @author ben10debian
 */
class ItemVenda {

    private String descricao;
    private double preco;
    
    
    
    public void setDescricao(String descricao) { this.descricao = descricao; }
    
    public String getDescricao(){ return descricao; }
        
    void setPreco(double preco) { this.preco = preco; }
 
    public double getPreco(){ return preco; }
    
}
