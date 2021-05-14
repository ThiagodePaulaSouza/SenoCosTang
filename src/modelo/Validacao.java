package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.numero = this.numero.replaceAll(",", ".");
            this.n1 = Double.parseDouble(this.numero);
            if (this.n1 < 0)
            {
                this.mensagem = "Digite apenas números positivos";
            }

            if (this.n1 > 360)
            {
                this.mensagem = "Número maior que 360 graus";
            }
        } 
        catch (NumberFormatException e)
        {
            mensagem = "Digite apenas números";
        } 
        catch (Exception e)
        {
            this.mensagem = "Número Inválido";
        }

    }

}
