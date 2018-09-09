public class Szachownica {


    void checkBeating(int[][] tab) {

        for (int k = 0; k < tab.length; k++) {
            for (int l = 0; l < tab[k].length; l++) {
                System.out.print(tab[k][l] + " | ");
            }
            System.out.println();
        }
/********************/


        for (int i = 0; i < tab.length; i++) {
            int sum = 0;
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] == 1) {
                    sum++;
                    if (sum > 1) {
                        System.out.printf("In %d row is beating!\n", i);
                        break;
                    }
                }
            }

        }

        for (int j = 0; j < tab.length; j++) {
            int sum = 0;
            for (int i = 0; i < tab[j].length; i++) {
                if (tab[i][j] == 1) {
                    sum++;
                    if (sum > 1) {
                        System.out.printf("In %d col is beating!\n", j);
                        break;
                    }
                }
            }

        }


    }

}

