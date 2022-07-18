package exercicios;
import java.util.Scanner;

public class TempoDeJogo {

    //Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
    //
    //Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
    //
    //Entrada
    //Quatro números inteiros representando a hora de início e fim do jogo.
    //
    //Saída
    //Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .

    //Exemplo de Entrada
    //7 8 9 10
    //Exemplo de Saída
    //O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

    //Essa resolução resolve os testes requisitados e muitos outros que o programa testa.
    // Nenhum erro encontrado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIn = sc.nextInt();
        int minutoIn = sc.nextInt();
        int horaOut = sc.nextInt();
        int minutoOut = sc.nextInt();

        int totalH = horaOut - horaIn;
        int totalM = minutoOut - minutoIn;

        if (totalH < 0) {
            totalH = 24 + (horaOut - horaIn);
        }

        if (totalM < 0) {
            totalM = 60 + (minutoOut - minutoIn);
            totalH--;
        }

        if (horaIn ==  horaOut && minutoIn < minutoOut) {
            totalH = horaIn - horaOut;
            totalM = minutoOut - minutoIn;
        }

        if (horaIn ==  horaOut && minutoIn > minutoOut) {
            totalH = 24 + (horaOut - horaIn);
            totalM = 60 + (minutoOut - minutoIn);
            totalH--;
        }

        if (horaIn == horaOut && minutoIn == minutoOut) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        else System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");
    }

}
