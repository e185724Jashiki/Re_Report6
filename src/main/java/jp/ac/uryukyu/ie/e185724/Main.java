package jp.ac.uryukyu.ie.e185724;

import com.sun.tools.classfile.ConstantPool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args){
        Board board = new Board();

        Player white = new Player('W', board.mass);
        Player black = new Player('B', board.mass);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        board.ToDisplay();  //盤の表示
        System.out.printf("白：%d個   黒：%d個\n", white.stoneNum, black.stoneNum);

        while (board.gameEnd != true) {
            System.out.print("どのマスへ置く？：");

            String str = null;
            try {
                str = br.readLine();
                br.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        while (board.gameEnd != true) {
            //System.out.println(mass);
            for (int i = 0; i < 6; i++) {
                System.out.print(board.yCoordinate[i] + " ");
                for (int j = 0; j < 6; j++) {
                    if (board.mass[i][j] == 'N') {
                        System.out.print(" - ");
                    } else if (board.mass[i][j] == 'B') {
                        System.out.print(" ● ");
                    } else if (board.mass[i][j] == 'W') {
                        System.out.print(" ◯ ");
                    }
                }
                System.out.println("");
            }
        }
         */

    }
}
