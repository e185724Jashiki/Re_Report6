package jp.ac.uryukyu.ie.e185724;

public class Player {

    private char color; //自分の色
    int stoneNum = 0;   //所持している石の数

    /**
     * コンストラクタ（引数なし）
     * 引数指定がないため，colorにはとりあえず'W'を代入する
     */
    Player () {
        color = 'W';
        stoneNum = 0;
    }
    /**
     * コンストラクタ（char型引数）
     * @param color 第1引数：自分の色
     */
    Player (char color) {
        this.color = color;
        stoneNum = 0;
    }
    /**
     * コンストラクタ（char型引数, int型引数）
     * @param color 第1引数：自分の色
     * @param stoneNum 第2引数：所持している石の数
     */
    Player (char color, int stoneNum) {
        this.color = color;
        this.stoneNum = stoneNum;
    }
    /**
     * コンストラクタ（char型引数, char型多重配列の引数）
     * @param color 第1引数：自分の色
     * @param mass 第2引数：オセロ盤の状態を示す多次元配列
     */
    Player (char color, char[][] mass) {
        this.color = color;
        StoneCount(mass);
    }

    /**
     * オセロ盤を読み取り，自分の石の数をカウントしてstoneNumへ代入するメソッド
     * @param mass オセロ盤の状態を示す多次元配列
     */
    void StoneCount (char[][] mass) {
        stoneNum = 0;

        for (int i=0; i<mass.length; i++) {
            for (int j=0; j<mass[0].length; j++) {
                if ((color == 'W') && (mass[i][j] == color)) {
                    stoneNum++;
                }
                else if ((color == 'B') && (mass[i][j] == color)) {
                    stoneNum++;
                }
            }
        }
    }
}
