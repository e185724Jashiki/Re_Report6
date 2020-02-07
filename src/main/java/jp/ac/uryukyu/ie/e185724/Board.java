package jp.ac.uryukyu.ie.e185724;


public class Board {
    char[][] mass = {
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'} };
    char[] xCoordinate = {'a','b','c','d','e','f'};
    char[] yCoordinate = {'1','2','3','4','5','6'};

    boolean gameEnd;

    /**
     * コンストラクタ
     *
     */
    Board () {
        System.out.println("初期石配置");
        mass[2][2] = 'W';
        mass[3][3] = 'W';
        mass[2][3] = 'B';
        mass[3][2] = 'B';

        gameEnd = false;
    }

    /**
     * 盤の表示のみを行うメソッド
     *
     */
    void ToDisplay () {
        System.out.print("  ");
        for (char c : xCoordinate) {
            System.out.print(" " + c + " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.print(yCoordinate[i] + " ");

            for (int j = 0; j < mass[0].length; j++) {
                if (mass[i][j] == 'N') {
                    System.out.print(" - ");
                }
                else if (mass[i][j] == 'B') {
                    System.out.print(" ● ");
                }
                else if (mass[i][j] == 'W') {
                    System.out.print(" ◯ ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * 盤の表示のみを行うメソッド
     *
     */
    void PutStone (String str) {

    }
}
