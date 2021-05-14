package modelo;

public abstract class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String numero;
    protected String resposta;
    protected Double n1;
    protected Double radians;
    protected Double seno;
    protected Double cosseno;
    protected Double tangente;
    

    public absPropriedades(String numero)
    {
        this.numero = numero;
        this.Executar();
    }

    public absPropriedades(Double n1)
    {
        
        this.n1 = n1;
        this.Executar();
    }

    @Override
    public String toString()
    {
        return resposta;
    }
    
    @Override
    public void Executar()
    {
        
    }
    
}
