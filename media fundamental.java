package exerciciossala;

import java.util.Scanner;

public class d0205e001 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);//puxando impressora
        
        int n1, n2, n3, ra;//inicializando variaveis
        float media;

        System.out.println("Qual o RA do aluno? \n(Se não houver mais alunos, digite 0)\n RA: ");//imprimindo
        ra = ler.nextInt();//recebendo
        
        while(ra != 0){//criando laço de repetição para até que haja ra existente
            
                System.out.println("Digite sua nota 1: ");
                n1 = ler.nextInt();
                System.out.println("Digite sua nota 2: ");
                n2 = ler.nextInt();
                System.out.println("Digite sua nota 3: ");
                n3 = ler.nextInt();
        
                media = (n1 + n2 + n3)/3;//calcando a media
        
                if(media >= 8 ){//condição para aprovado
                    System.out.println("APROVADO!");
                }else if(media < 8 && media >= 6){//condição para recuperação
                    System.out.println("RECUPERAÇÃO!");
                }else{//condição para reprovado
                    System.out.println("REPROVADO!");
                }       
                System.out.println("Qual o RA do aluno? \n(Se não houver mais alunos, digite 0)\n RA: ");
                ra = ler.nextInt();
        }            
}  
}
