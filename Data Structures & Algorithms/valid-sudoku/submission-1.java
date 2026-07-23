class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> column = new HashSet<>();
        HashMap<Integer, HashSet<Integer>> grid = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> init = new HashSet<>();
            init.add(0);
            grid.put(i, init);
        }

        for (int i = 0; i < 9; i++) {
            row.clear();
            column.clear();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int columnNumber = board[j][i] - '0';
                    if (column.contains(columnNumber)) return false;
                    column.add(columnNumber);
                }

                if (board[i][j] != '.') {
                    int rowNumber = board[i][j] - '0';
                    if (row.contains(rowNumber)) return false;
                    row.add(rowNumber);
                    int gridIndex = ((i) / 3) * 3 + (j) / 3;
                    if (!grid.get(gridIndex).contains(rowNumber)) {
                        HashSet<Integer> newEl = grid.get(gridIndex);
                        newEl.add(rowNumber);
                        grid.put(gridIndex, newEl);
                        continue;
                    } else return false;
                }
            }
        }
        return true;
    }
}