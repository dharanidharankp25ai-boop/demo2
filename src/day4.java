void main() {
    int[][] marks = new int[5][3];
    int[][] StudentMarks = {
            {23, 45, 67},
            {87, 30, 12},
            {26, 63, 90},
            {66, 87, 54},
            {78, 95, 48}
    };
    for (int row = 0; row < StudentMarks.length; row++) {
        for (int col = 0; col < StudentMarks[row].length; col++) {
            System.out.print(StudentMarks[row][col]+ " ");
        }
    System.out.println();
    }
}