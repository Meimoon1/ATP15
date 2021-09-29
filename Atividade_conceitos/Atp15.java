package Atividade_conceitos;
public class Atp15{
    public static void main(String[] args) {
        // Primeiro objeto da classe pessoa
        Pessoa p1 = new Pessoa();
        p1.nome = "Melissa";
        p1.sobrenome = "Matos";
        p1.idade = 23;

        // Segundo objeto da classe pessoa
        Pessoa p2 = new Pessoa();
        p2.nome = "Frodo";
        p2.sobrenome = "Bolseiro";
        p2.idade = 33;

        //Imprimindo Primeira pessoa
        System.out.println("---------Pessoa 1---------");
        System.out.println("Nome: "+p1.nome);
        System.out.println("Sobrenome :"+p1.sobrenome);
        System.out.println("Idadade: "+p2.idade);

        
        

        
    }
}