package jp.ac.uryukyu.ie.e185724;

public class Main {
    public static void main(String[] args){
        Board board = new Board();

        System.out.print("  ");
        for (char c : board.xCoordinate) {
            System.out.print(" " + c + " ");
        }
        System.out.println();

        //System.out.println(mass);
        for (int i=0; i<6; i++) {
            System.out.print(board.yCoordinate[i] + " ");
            for (int j=0; j<6; j++){
                if (board.mass[i][j] == 'N'){
                    System.out.print(" - ");
                }
                else if (board.mass[i][j] == 'B') {
                    System.out.print(" ● ");
                }
                else if (board.mass[i][j] == 'W') {
                    System.out.print(" ◯ ");
                }
            }
            System.out.println("");
        }
    }
}
