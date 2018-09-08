public class SmallestInBigestValueInRow {

    int min = Integer.MAX_VALUE;
    int max;
    int row = -1;

    String findMyValue(int[][] tab) {

        for (int i = 0; i < tab.length; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " | ");
                if (max < tab[i][j]) {
                    max = tab[i][j];
                }
            }
            if (max < min) {
                min = max;
                row = i;
            }
            System.out.println("\n");
        }

        return "Najmniejszy z największych to: " + min + " w wierszu: " + row;
    }

}
