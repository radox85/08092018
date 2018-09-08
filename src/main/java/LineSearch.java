public class LineSearch {

    public int lineSearch(int[] tab, int searchInt) {

        int counterOfCheck = 0;

        for (int i = 0; i < tab.length; i++) {

            counterOfCheck++;
            if (searchInt == tab[i]) {
                System.out.println("Found search Int on index " + i);
                return counterOfCheck;
            }

        }
        return -1;
    }

}
