import javax.swing.JOptionPane;

public class QuintoPrograma
{

	public static void main(String[] args)
{
		
		 VendaAtacado venda = new VendaAtacado();
        
        venda.ReceberDados(10, "camisa", 100);
        venda.CalcularNoAtacado();
        venda.CalcularVendaUnitario();

        String mensagem = "Codigo Produto: " + venda.codigoItem + "\nDescrição item: " + venda.descricaoitem+
        					"\nPreco de custo: " + venda.valorCusto+"\nPreco Atacado: " + venda.valorAtacado+
        					"\nPreco Unitario: " + venda.valorUnitario;
        
        JOptionPane.showMessageDialog(null,mensagem);

	}	
}


class VendaAtacado 
{
    public int codigoItem;
 	public String descricaoitem;
 	public double valorCusto;
    public double valorAtacado;
    public double valorUnitario;

    public void ReceberDados(int codigoItem, String descricaoitem, double valorCusto)
 {
        this.codigoItem = codigoItem;
        this.descricaoitem = descricaoitem;
        this.valorCusto = valorCusto;
        
    }
        
    public void CalcularNoAtacado()
{
        this.valorAtacado = this.valorCusto * 1.3; 
    }
    public void CalcularVendaUnitario()
{
        this.valorUnitario = this.valorCusto * 1.6; 
    }
}
