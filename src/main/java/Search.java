public class Search{

    public static void main(String[] args) {

        int counter = 0;
        int[] tab = new int[]{1, 4, 24, 64, 87, 99, 121, 765};
        int searchNumber = 87;

        LineSearch lineSearch = new LineSearch();
        System.out.println("Ilość porównań w wyszukiwaniu liniowym: " + lineSearch.lineSearch(tab, searchNumber));

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Ilość porównań w wyszukiwaniu binarnym: " + binarySearch.binarySearch(tab,searchNumber));



    }

}
