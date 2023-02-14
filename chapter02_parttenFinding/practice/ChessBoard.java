package chapter02_parttenFinding.practice;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        // String[] board = new String[] {"OOX","XXO","OX "};
        // String[] board = new String[] {"O"};
        // ["O X"," XO","X O"]
        String[] board = new String[] {"O X", " XO", "X O"};
        System.out.println(tictactoe(board));

    }
    public static String tictactoe(String[] board) {
        char[][] charBoard = new char[board.length][board.length];
        boolean isEmpty = false;
        for(int i=0; i<board.length; i++){
            String tempRow = board[i];
            char[] tempCharRow = tempRow.toCharArray();
            for (int j = 0; j<tempCharRow.length; j++){
                charBoard[i][j] = tempCharRow[j];
                if (tempCharRow[j]==' '){
                    isEmpty = true;
                }
            }
        }
        
        if (isEmpty){
            String winner = checkWin(charBoard);
            if (winner == "X"){
                return "X";
            }else if (winner == "O"){
                return "O";
            }else {
                return "Pending";
            }  
        } else {
            String winner = checkWin(charBoard);
            if (winner == "X"){
                return "X";
            }else if (winner == "O"){
                return "O";
            }else {
                return "Draw";
            }
        }
    }
    public static String checkWin(char[][] charBoard) {
        for (char[] temp : charBoard){
            System.out.println(Arrays.toString(temp));
        }
        for (int i = 0; i<charBoard.length; i++){
            int xSum = 0;
            int oSum = 0;
            for (int j = 0; j<charBoard[0].length; j++){
                if (charBoard[i][j] == 'X'){
                    xSum++;
                } else if (charBoard[i][j]  == 'O'){
                    oSum++;
                }
                if (xSum == charBoard.length) {
                    return "X";
                } else if (oSum == charBoard.length) {
                    return "O";
                }
            }
        }
        for (int i=0; i<charBoard.length; i++){
            int xSum = 0;
            int oSum = 0;
            for (int j=0; j<charBoard[0].length; j++){
                if (charBoard[j][i] == 'X'){
                    xSum++;
                } else if (charBoard[j][i] == 'O'){
                    oSum++;
                }
                if (xSum == charBoard.length) {
                    return "X";
                } else if (oSum == charBoard.length) {
                    return "O";
                }
            }
        }
        int xSum=0;
        int oSum=0;
        for (int i=0; i<charBoard.length; i++){
            
            if (charBoard[i][i]=='X'){
                xSum++;
            }else if (charBoard[i][i]=='O'){
                oSum++;
            }
            if (xSum == charBoard.length ){
                return "X";
            } else if (oSum == charBoard.length) {
                return "O";
            }
        }

        int xSum_1 = 0;
        int oSum_1 = 0;
        for (int i=0; i<=charBoard.length-1; i++){
            if(charBoard[i][charBoard.length-1-i] == 'X'){
                xSum_1++;
            } else if (charBoard[i][charBoard.length-1-i] == 'O'){
                oSum_1++;
            }
            if (xSum_1 == charBoard.length ){
                return "X";
            } else if (oSum_1 == charBoard.length) {
                return "O";
            }
        }
        return "ZERO";
    }

    // when checking row can use the give String,
    // just when all stirng is the same

}