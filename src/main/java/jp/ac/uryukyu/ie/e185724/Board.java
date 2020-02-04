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

    /**
     * コンストラクタ
     *
     */
    Board() {
        System.out.println("初期石配置");
        mass[2][2] = 'W';
        mass[3][3] = 'W';
        mass[2][3] = 'B';
        mass[3][2] = 'B';
    }


}
