public class ThePrimeNumbers {

    static boolean countPrimeNumber(int numberToCheck) {

        for (int i = 2; i <  Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

}