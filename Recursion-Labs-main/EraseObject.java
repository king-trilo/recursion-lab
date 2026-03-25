import java.util.Scanner;

public class EraseObject
{
    private int [][] board;
    private Scanner in;

    public EraseObject(int [][] data)
    {
        board = data;
        in = new Scanner(System.in);
    }

    public void run()
    {
        // Print starting image
        System.out.println("Image before an erasure:");
        DisplayData.display(board);

        // First erasure
        input();
        System.out.println("Image after first erasure:");
        DisplayData.display(board);

        // Second erasure
        input();
        System.out.println("Image after second erasure:");
        DisplayData.display(board);
    }

    public void input()
    {
        System.out.println("Please input a row -> ");
        int r = in.nextInt();
        System.out.println("Please input a column -> ");
        int c = in.nextInt();
        erase(r, c);
    }

    public void erase(int row, int col)
    {
        // Out of bounds check
        if (row < 1 || row >= board.length || col < 1 || col >= board[0].length)
            return;

        // If this cell is not black, nothing to erase
        if (board[row][col] != 1)
            return;

        // Erase this cell
        board[row][col] = 0;

        // Recursively erase all connected neighbors (up, down, left, right)
        erase(row - 1, col);
        erase(row + 1, col);
        erase(row, col - 1);
        erase(row, col + 1);
    }
}