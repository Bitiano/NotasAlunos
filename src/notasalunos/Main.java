package notasalunos;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite o número de chamada do aluno: ");
        int chamada = sc.nextInt();

        System.out.println("Digite o curso do aluno: ");
        String curso = sc.nextLine();
        curso = sc.nextLine();

        System.out.println("Digite a turma do aluno: ");
        String turma = sc.nextLine();

        System.out.println("Digite a quantidade de disciplinas: ");
        int qtdDisciplinas = sc.nextInt();

        NotaDisciplina[] disciplinas = new NotaDisciplina[qtdDisciplinas];
        for(int i = 0; i < qtdDisciplinas; i++){
            System.out.println("Digite o nome da disciplina: ");
            String disciplina = sc.nextLine();
            sc.nextLine();

            System.out.println("Digite a média final do aluno: ");
            double media = sc.nextDouble();

            System.out.println("Digite a quantidade de faltas do aluno: ");
            int faltas = sc.nextInt();

            disciplinas[i] = new NotaDisciplina(disciplina, media, faltas);
        }

        NotasAluno notasAluno = new NotasAluno(new Aluno(nome, chamada, curso, turma), disciplinas);

        Boletim boletim = new Boletim();
        Resultado resultado = boletim.avaliar(notasAluno);

        System.out.println("Nome: " + resultado.getAluno().getNome());
        System.out.println("Chamada: " + resultado.getAluno().getChamada());
        System.out.println("Curso: " + resultado.getAluno().getCurso());
        System.out.println("Turma: " + resultado.getAluno().getTurma());
        System.out.println("Situação: " + resultado.getSituacao());
        System.out.println("Quantidade de Aprovações: " + resultado.getQtdAprovacoes());
        System.out.println("Quantidade de Reprovações: " + resultado.getQtdReprovacoes());

        sc.close();  
       
    }
}
