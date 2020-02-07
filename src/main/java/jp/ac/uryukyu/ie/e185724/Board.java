package jp.ac.uryukyu.ie.e185724;

public class Board {
    char[][] mass = {
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','W','B','N','N'},
            {'N','N','B','W','N','N'},
            {'N','N','N','N','N','N'},
            {'N','N','N','N','N','N'} };    //初期配置代入
    char[] xCoordinate = {'a','b','c','d','e','f'}; //x座標
    char[] yCoordinate = {'1','2','3','4','5','6'}; //y座標

    char playingPlayer = 'W';

    boolean gameEnd = false;

    /**
     * コンストラクタ（引数なし）
     *
     */
    Board () {
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
                } else if (mass[i][j] == 'B') {
                    System.out.print(" ● ");
                } else if (mass[i][j] == 'W') {
                    System.out.print(" ◯ ");
                }
            }
            System.out.println("");
        }
    }

    /**
     * 石を置くメソッド
     * 座標を引数で指定して，石を置いて盤の情報を書き換える。
     * @param str 石を置きたい座標
     * @return 正常に置き終えたならtrue，問題が生じて置けなかった場合はfalseを返す
     */
    boolean PutStone (String str) {
        char alphabetCoordinate = str.charAt(0);
        char numberCoordinate = str.charAt(1);
        byte byteAlphabetCoordinate = (byte) alphabetCoordinate;
        byte byteNumberCoordinate = (byte) numberCoordinate;

        //文字数が2なら
        if (str.length() == 2) {
            //1文字目がa〜fかつ，2文字目が1〜6なら
            if (((byteAlphabetCoordinate >= 97) && (byteAlphabetCoordinate <= 102)) &&
                    ((byteNumberCoordinate >= 49) && (byteNumberCoordinate <= 54))) {

                System.out.println("OK");

                for (int x=0; x<xCoordinate.length; x++) {
                    if (alphabetCoordinate == xCoordinate[x]) {
                        for (int y=0; y<yCoordinate.length; y++) {
                            //指定した座標が確定
                            if (numberCoordinate == yCoordinate[y]) {
                                //既に石が置かれていないか。
                                if (mass[y][x] == 'N') {
                                    mass[y][x] = playingPlayer;
                                    /*
                                    if (playingPlayer == 'W') {
                                        playingPlayer = 'B';
                                    }
                                    else if (playingPlayer == 'B') {
                                        playingPlayer = 'W';
                                    }

                                     */
                                    return true;
                                } else {
                                    System.out.println("既に置かれています。");
                                }
                                break;
                            }
                        }
                        break;
                    }
                }


            } else {
                System.out.println("その座標は存在しません。");
            }
        } else {
            System.out.println("半角英数の2文字で入力する必要があります。");
        }

        return false;
    }
}
