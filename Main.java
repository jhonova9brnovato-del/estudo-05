import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner Notas = new Scanner(System.in);
        System.out.print("insira a nota do aluno");
        double nota = Notas.nextInt();
        if (nota >= 7){
            System.out.println("Esta aprovado");
        }else{
            System.out.println("Não esta aprovado");
    }
}}

