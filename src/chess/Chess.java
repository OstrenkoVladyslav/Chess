package chess;

public class Chess {

    public static void main(String[] args) {
        int chess_desk [][];
        chess_desk = new int [8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                chess_desk[i][j]=(i+j)%2;
                System.out.print(chess_desk[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
