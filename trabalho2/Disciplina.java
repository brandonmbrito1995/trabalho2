package trabalho2;

public class Disciplina
{
    private double mediaNotas1, mediaNotas2;
    public Aluno[] alunos = new Aluno[10];
    
    public void adicionarAluno(int novaPosicao,String novoNome,
    int novoId, double novaNota1, double novaNota2)
    {
        alunos[novaPosicao].novaNota1(novaNota1);
        alunos[novaPosicao].novaNota2(novaNota2);
        alunos[novaPosicao].alteraNome(novoNome);
        alunos[novaPosicao].alteraId(novoId);
    }
    public double mediaNota1(double mediaNotas1)
    {
        mediaNotas1 = 0;
        for (int i = 0; i<alunos.length; i++)
        {
            mediaNotas1 += alunos[i].nota1;
        }
        return mediaNotas1/10;
    }
    public double mediaNota2(double mediaNotas2)
    {
        mediaNotas2= 0;
        for (int i = 0; i<alunos.length; i++)
        {
            mediaNotas2 += alunos[i].nota2;
        }
        return mediaNotas2/10;
    }
    public void anteriorsucessorNome(int novaPosicao, int antecessor, int sucessor)
    {
        antecessor = novaPosicao - 1;
        sucessor = novaPosicao + 1;
         if (novaPosicao == 0) 
        {
            System.out.println(alunos[sucessor].lerNome());
        }else if(1 <= novaPosicao && novaPosicao < 8)
        {
            System.out.println(alunos[antecessor].lerNome());
            System.out.println(alunos[sucessor].lerNome());
        }else 
        {
            System.out.println(alunos[antecessor].lerNome());
        }
    }
}
