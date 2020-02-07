package jp.ac.uryukyu.ie.e185724;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Board board = new Board();

        Player white = new Player('W', board.mass);
        Player black = new Player('B', board.mass);

        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        board.ToDisplay();  //盤の表示
        System.out.printf("白：%d個   黒：%d個\n", white.stoneNum, black.stoneNum);

        while (!board.gameEnd) {
            System.out.print("どのマスへ置く？：");
            //System.out.println(inputStr);

            board.gameEnd = true;
        }
    }
}
