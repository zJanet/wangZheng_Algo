package chapter02_parttenFinding.practice;

public class ChessBoard_v2 {
    // reference https://juejin.cn/post/6953554399020974087
    public static void main(String[] args) {
        // String[] board = new String[] {"OOX","XXO","OX "};
        String[] board = new String[] {"O"};
        // ["O X"," XO","X O"]
        // String[] board = new String[] {"O X", " XO", "X O"};
        System.out.println(tictactoe(board));
    }
    public static String tictactoe(String[] board) {
        int boardLen = board.length;
        int leftDiagnoal = 0; // local variable(inside function) need to be initialized before using
        int rightDiagnoal = 0;
        boolean isEmptyCell = false;
        for (int i=0; i<boardLen; i++){
            int currentRowSum = 0;
            int currentColumnSum = 0;
            for (int j=0; j<boardLen; j++){
                currentRowSum += (int)board[i].charAt(j); //[0][0], [0][1], [0][2]
                currentColumnSum += (int)board[j].charAt(i); //[0][0], [1][0], [1][2]
                if (board[i].charAt(j) == ' ' || board[j].charAt(i) == ' ') isEmptyCell=true;
            }
            //now, we got the sum of row i, and column i
            if ((currentRowSum == (int)'X'*boardLen) ||  (currentColumnSum == (int)'X'*boardLen)) return "X";
            if ((currentRowSum == (int)'O'*boardLen) ||  (currentColumnSum == (int)'O'*boardLen)) return "O";
            // no return condition met on row and column i, start calculating diagnoal sum
            leftDiagnoal += (int)board[i].charAt(i);
            rightDiagnoal += (int)board[i].charAt(boardLen-1-i);
        }
        // now, we got the sum of diagnoal left and right
        if ((leftDiagnoal == (int)'X'*boardLen) ||  (rightDiagnoal == (int)'X'*boardLen)) return "X";
        if ((leftDiagnoal == (int)'O'*boardLen) ||  (rightDiagnoal == (int)'O'*boardLen)) return "O";
        // no return condition met on dianoal as well
        return isEmptyCell? "Pending":"Draw";  
    }
}