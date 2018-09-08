public class BinarySearch {

    int binarySearch(int[] tab, int searchNumber) {

        int numberOfCheck = 0;
        int leftIndex = 0;
        int rightIndex = tab.length - 1;
        int middleIndex = rightIndex / 2;
        System.out.printf("L: %d S: %d P: %d \n", leftIndex, middleIndex, rightIndex);

        while (leftIndex <= rightIndex) {

            if (tab[middleIndex] == searchNumber) {
                System.out.println("Found search Int on index " + middleIndex);
                numberOfCheck++;
                return numberOfCheck;
            }
            numberOfCheck++;
            if (searchNumber < tab[middleIndex]) {
                rightIndex = middleIndex - 1;
                middleIndex = (leftIndex + rightIndex) / 2;

            } else if (searchNumber > tab[middleIndex]) {
                leftIndex = middleIndex + 1;
                middleIndex = (leftIndex + rightIndex) / 2;
            }

        }

        return -1;
    }


}
