package modelo;

public class Controle extends absPropriedades
{
    public Controle(String numero)
    {
        super(numero);
    }
    
    @Override
    public void Executar()
    {
        mensagem = "";
        Validacao validacao = new Validacao(numero);
        if ("".equals(validacao.mensagem))
        {
            Calcular calcular = new Calcular(validacao.n1);
            this.resposta = calcular.resposta;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
