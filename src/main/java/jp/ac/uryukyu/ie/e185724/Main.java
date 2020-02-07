package jp.ac.uryukyu.ie.e185724;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Board board = new Board();

        Player white = new Player('W', board.mass);
        Player black = new Player('B', board.mass);

        Scanner scanner = new Scanner(System.in);
        String inputStr;

        boolean WorB = false;
        while (WorB != true) {
            System.out.print("先攻を選択してください（白ならW，黒ならBと入力）：");
            inputStr = scanner.nextLine();
            if ((inputStr.equals("W")) || (inputStr.equals("B"))) {
                board.playingPlayer = inputStr.charAt(0);
                WorB = true;
            } else {
                System.out.print("半角で，WかBを入力する必要があります。");
            }
        }

        while (!board.gameEnd) {
            board.ToDisplay();  //盤の表示
            System.out.printf("白：%d個   黒：%d個\n", white.stoneNum, black.stoneNum);

            boolean turnEnd = false;
            while (turnEnd != true) {
                if (board.playingPlayer == 'W') {
                    System.out.println("白の番です。");
                } else if (board.playingPlayer == 'B') {
                    System.out.println("黒の番です。");
                }

                System.out.print("どのマスへ置く？：");
                inputStr = scanner.nextLine();

                turnEnd = board.PutStone(inputStr);
            }

            board.gameEnd = false;
        }
    }
}
