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
        String disciplina = "";
        double media = 0;
        int faltas = 0;
        for(int i = 0; i < qtdDisciplinas; i++){
            System.out.println("Digite o nome da disciplina: ");
            disciplina = sc.nextLine();
            sc.nextLine();

            System.out.println("Digite a média final do aluno: ");
            media = sc.nextDouble();

            System.out.println("Digite a quantidade de faltas do aluno: ");
            faltas = sc.nextInt();

            disciplinas[i] = new NotaDisciplina(disciplina, media, faltas);
        }

        NotasAluno notasAluno = new NotasAluno(new Aluno(nome, chamada, curso, turma), disciplinas);

        Boletim boletim = new Boletim();
        Resultado resultado = boletim.avaliar(notasAluno);

        System.out.println("Nome: " + notasAluno.getAluno().getNome());
        System.out.println("Chamada: " + notasAluno.getAluno().getChamada());
        System.out.println("Curso: " + notasAluno.getAluno().getCurso());
        System.out.println("Turma: " + notasAluno.getAluno().getTurma());
        System.out.println("Quantidade de disciplinas: " + qtdDisciplinas);
        System.out.println("Quantidade de aprovações: " + resultado.getQtdAprovacoes());
        System.out.println("Quantidade de reprovações: " + resultado.getQtdReprovacoes());
        System.out.println("Situacao: " + boletim.VerificarSituacao(chamada, faltas));
        sc.close();  
       
    }
}
