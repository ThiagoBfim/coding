package codewar.kyu.four;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        if (sudoku.length < 9) {
            return false;
        }
        for (var i = 0; i < sudoku.length; i++) {
            Set<Integer> columns = new HashSet<>();
            Set<Integer> lines = new HashSet<>();
            for (var j = 0; j < sudoku[i].length; j++) {
                columns.add(sudoku[j][i]);
                lines.add(sudoku[i][j]);
            }
            if (columns.size() != 9 || lines.size() != 9 || lines.stream().anyMatch(s -> s <= 0 || s > 9)) {
                return false;
            }
        }

        return !isSubsquareInvalid(sudoku);
    }

    private static boolean isSubsquareInvalid(int[][] sudoku) {
        for(int row = 0; row < 9; row += 3)
            for(int col = 0; col < 9; col += 3)
                for(int pos = 0; pos < 8; pos++)
                    for(int pos2 = pos + 1; pos2 < 9; pos2++)
                        if(sudoku[row + pos%3][col + pos/3]==sudoku[row + pos2%3][col + pos2/3])
                            return true;
        return false;
    }


}
