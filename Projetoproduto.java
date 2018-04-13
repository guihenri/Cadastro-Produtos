


package projetoproduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author guilherme.oliveira
 */
public class Projetoproduto {
static Integer vM = 0;
static Scanner porta = new Scanner(System.in);
static List<NewClassMenu> itens = new ArrayList<NewClassMenu>();
 public static void main(String[] args) {
  while (vM != 3) {
  if (vM == 1) {
  informarValores();
  chamarMenu();
  } else if (vM == 2) {
  imprimir();
  chamarMenu();
  } else if (vM == 3) {
  System.exit(0);
  } else {
  chamarMenu();
    }
    }
    }
    private static void imprimir() {
     for (NewClassMenu produto : itens) {
     System.out.println(produto);
        }	
	}
	private static void informarValores() {
	System.out.println("Nome do Produto");
	String name = porta.next();
	System.out.println("Quantidade");
	Integer quantidade = porta.nextInt();
	System.out.println("Valor");
	Float valor = porta.nextFloat();	
	NewClassMenu novoProduto = new NewClassMenu(name, quantidade, valor);
	itens.add(novoProduto);
	}
	private static void chamarMenu() {
	System.out.println("\nInformações de estoque");
	System.out.println("MENU");
	System.out.println("1:CADASTRAR PRODUTO");
	System.out.println("2:IMPRIMIR");
	System.out.println("3:SAIR");
		
	vM = porta.nextInt();
	}
        }