import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Insira o nome do aluno: ");
        a.nome = sc.next();
        System.out.println("Digite a primeira nota: ");
        a.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        a.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        a.nota3 = sc.nextDouble();

        System.out.println(a.nome);
        a.somar();
    }
}