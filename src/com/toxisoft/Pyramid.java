package com.toxisoft;

public class Pyramid {
    private final char BLANK_CHAR = ' ';
    private final char STEP_CHAR = 'X';
    private final int CENTER_SPACE = 1;
    private char[][] data;
    private int columns;
    private int rows;

    public Pyramid(int columns, int rows) {
        this.data = new char[columns][rows];
        this.columns = columns;
        this.rows = rows;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                this.data[c][r] = BLANK_CHAR;
            }
        }
    }

    public boolean buildPyramid() {
        int center = columns / 2;
        int c1 = center - CENTER_SPACE;
        int c2 = center + CENTER_SPACE;

        for (int r = 0; r < this.rows; r++) {
            for (int i = r; i < this.rows; i++) {
                this.data[c1][i] = STEP_CHAR;
                this.data[c2][i] = STEP_CHAR;
            }
            c1--;
            c2++;
            if (c1 == 0 || c2 == this.columns)
                break;
        }
        return true;
    }

    public void print() {
        for (int r = 0; r < this.rows - CENTER_SPACE; r++) {
            for (int c = 0; c < this.columns; c++) {
                System.out.print(this.data[c][r]);
            }
            System.out.println();
        }
    }
}