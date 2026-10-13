public class CadastrosAlunos {
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidadesAlunos = scanner.nextInt();

        scanner.nextLine();

        Alunos[] alunos = new Alunos[quantidadesAlunos];

        for (int i = 0; i < quantidadesAlunos; i++) {
            System.out.println("\nCadastro do aluno" + (i+1));

            System.out.print("Nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            System.out.print("Quantas notas esse aluno terá? ");
            int quantidadesNotas = scanner.nextInt();

            double[] notasAlunos = new double[quantidadesNotas];

            for (int j = 0; j < notasAlunos.length; j++) {

                double nota;

                do{
                    System.out.print("Digite a nota " + (j+1) + " (0 a 10).");
                    nota = scanner.nextDouble();

                    if(nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite uma nota de 0 e 10.");
                    }

                }while(nota < 0 || nota > 10);
                notasAlunos[j] = nota;

            }

                scanner.nextLine();
             alunos[i] = new Alunos(nomeAluno, notasAlunos);
        }
             System.out.println("\n====RESULTADO====");

        for (int i = 0; i < quantidadesAlunos; i++) {
            double soma = 0;
            for (int j = 0; j < alunos[i].getNotas().length; j++) {
                soma += alunos[i].getNotas()[j];
            }
            double media = soma / quantidadesAlunos;

            System.out.println("\nAluno: " + alunos[i].getNome());
            System.out.println("Media: " + media);
        }
        scanner.close();
    }

