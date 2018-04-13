


package projetoproduto;

/**
 *
 * @author guilherme.oliveira
 */
public class NewClassMenu {
private String n;
private Integer q;
private Float v;
private Float vT;	
 public NewClassMenu (String name, int quantidade, float valor) {
 this.n = name;
 this.q = quantidade;
 this.v = valor;
 this.vT = valor * quantidade;
   }	
   public String toString() {
   return "Nome: " + n + "; Quantidade.: " + q + "; Preço: "
        + v + "; Valor Total: " + vT;
    }
    public String getName() {
	return n;
    }
    public void setName(String name) {
	this.n = name;
    }
    public Integer getQuant() {
	return q;
    }
    public void setQuant(int quantidade) {
	this.q = quantidade;
	this.vT = quantidade*v;
    }
    public Float getValor() {
	return v*q;
    }
    public void setValor(Float valor) {
	this.v = valor;
	this.vT = q*valor;
    }
    public Float getvalorTotal() {
	return vT;
    }	
    }
