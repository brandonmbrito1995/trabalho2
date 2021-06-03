package trabalho2;
public class Aluno
{
    private String nome;
    private int id;
    private double media;
    public double nota1, nota2;

    public void imprimeNome()
    {
        System.out.println(this.nome);
    }
     public void alteraNome(String novoNome)
    {        
        this.nome = novoNome;    
    }
    public void imprimeId()
    {
        System.out.println(id);
    }
    public void alteraId(int novoId)
    {
        this.id = novoId;
    }
    public double retornaMedia()
    {
        return this.media;
    }
    public double passouMedia()
    { 
        if (media >= 7.0) 
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        return media;
    }
    public double calculaMedia(double n1,double n2)
    {
        nota1 = n1;
        nota2 = n2;
        this.media = (this.nota1+this.nota2)/2;
        return this.media;
    }
    public String lerNome()
    {
        return this.nome;
    }
    public double novaNota1(double novaNota1)
    {
         return this.nota1 = novaNota1;    
    }
    public double novaNota2(double novaNota2)
    {
         return this.nota2 = novaNota2;    
    }
}
