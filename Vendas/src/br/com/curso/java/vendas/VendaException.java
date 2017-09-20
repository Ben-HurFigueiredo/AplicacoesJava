
package br.com.curso.java.vendas;


public class VendaException  extends RuntimeException{

    private int codigo;

    public VendaException(int codigo, String menssage) {
 
        super("message");
        
        this.codigo = codigo;
        
    }
    
    public int getCodigo() { return codigo; }
}
