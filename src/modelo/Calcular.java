package modelo;

import java.text.DecimalFormat;


public class Calcular extends absPropriedades
{
    public Calcular(Double n1)
    {
        super(n1);
    }
    
    @Override
    public void Executar()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        radians = (Math.PI /180)*this.n1;
        seno = Math.sin(radians);
        cosseno = Math.cos(radians); 
        tangente = Math.tan(radians);
  
        resposta = "<html> Seno = " + df.format(radians)
                + "<br> Cosseno = " + df.format(cosseno)
                + "<br> Tangente  = " + df.format(tangente) + "</html>";
    }
}
