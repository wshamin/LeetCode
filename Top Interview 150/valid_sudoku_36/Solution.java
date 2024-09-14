package valid_sudoku_36;

public class Solution {

    public static void main(String[] args) {
        char[][] board1 = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        char[][] board2 = {{'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board1));
        System.out.println(isValidSudoku(board2));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

            for (int j = 0; j < board[i].length; j++) {
                Integer value = charToInteger(board[i][j]);

                if (value != null) {
                    if (value.equals(array[value - 1])) {
                        array[value - 1] = null;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

            for (int j = 0; j < board[i].length; j++) {
                Integer value = charToInteger(board[j][i]);

                if (value != null) {
                    if (value.equals(array[value - 1])) {
                        array[value - 1] = null;
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 1; i < board.length; i += 3) {
            for (int j = 1; j < board.length; j += 3) {
                Integer[] array = { null, null, null, null, null, null, null, null, null };
                int lastPushedIndex = 0;

                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        Integer value = charToInteger(board[i + k][j + l]);

                        if (value != null) {
                            for (int m = 0; m < lastPushedIndex; m++) {
                                if (array[m] == value) {
                                    return false;
                                }
                            }
                            array[lastPushedIndex] = value;
                            lastPushedIndex++;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static Integer charToInteger(char c) {
        if (Character.isDigit(c)) {
            return Character.getNumericValue(c);
        } else {
            return null;
        }
    }
}
