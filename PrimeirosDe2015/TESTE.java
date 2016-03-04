
//6.Crie uma classe que instancie um objeto do seu conhecimento. Esta classe deverá conter um método com argumento e método simples que efetue algum calculo com retorno ao método main() da classe principal


import javax.swing.JOptionPane;  
  
  
public class pessoal
 {  
  
    public static void main(String[] args) 
{  
          
        String escrevanome= JOptionPane.showInputDialog("Escreva seu nome:");  
        int digiteidade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));  
          
        Pessoa p1 = new Pessoa(nome,idade);  
          
    }  
}  
public class Pessoa 
{  
	  
public Pessoa(String escrevanome, int digiteidade) 
{  
        System.out.println(nome + " Sua idade é..." + idade + "anos.");  
    }  
  
} 
