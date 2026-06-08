void main() {
    int n = 5;
    for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= row; col++) {
            if (row == 5 && col == 5) {
                continue;
            }
            System.out.print("*");
        }
        System.out.println();
    }
}
