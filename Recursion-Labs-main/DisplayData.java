public class DisplayData {

    public static void display(int [][] data){
        // Print column header
        System.out.print("   ");
        for (int c = 1; c < data[0].length; c++) {
            System.out.print(c % 10);
        }
        System.out.println();

        // Print each row
        for (int r = 1; r < data.length; r++) {
            if (r < 10)
                System.out.print(" " + r + " ");
            else
                System.out.print(r + " ");

            for (int c = 1; c < data[0].length; c++) {
                if (data[r][c] == 1)
                    System.out.print("@");
                else
                    System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}