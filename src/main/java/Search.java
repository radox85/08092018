public class Search {

    public static void main(String[] args) {

        int counter = 0;
        int[] tab = new int[]{1, 4, 24, 64, 87, 99, 121, 765};
        int searchNumber = 87;

        LineSearch lineSearch = new LineSearch();
        System.out.println("Ilość porównań w wyszukiwaniu liniowym: " + lineSearch.lineSearch(tab, searchNumber));

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Ilość porównań w wyszukiwaniu binarnym: " + binarySearch.binarySearch(tab, searchNumber));

        System.out.println(ThePrimeNumbers.countPrimeNumber(11));

        SmallestInBigestValueInRow smallestInBigestValueInRow = new SmallestInBigestValueInRow();


        int tabToCheck[][] = {
                {1, 6, 132, 7, 0},
                {43, 98, 2, 8, 2},
                {234, 1, 5, 0}
        };
        System.out.println(smallestInBigestValueInRow.findMyValue(tabToCheck));
        System.out.println("\n\nSzachownica \n");

        int tabSzach[][] = {
                {1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };
        double tabSzach[][];

        Szachownica szachownica = new Szachownica();
        szachownica.checkBeating(tabSzach);

        /********Zadanie 5********/
        System.out.println("Zadanie 5 \n\n");
        MaxThisSameNumberInRow maxThisSameNumberInRow = new MaxThisSameNumberInRow();
        int[][] tabWithMaxIntInRow = maxThisSameNumberInRow.returnTabWithRandomInt(10,10);
        MaxThisSameNumberInRow.printTab(tabWithMaxIntInRow);
    }

}
