public static class ThePrimeNumbers {

    static int countPrimeNumber(int[] tab) {
        int numberOfPrimeNumbers = 0;

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] == 1 && tab[i] == 2) {
                numberOfPrimeNumbers++;
                i++;
            }

        if(tab[i]%2 == 0){
            i++;
        }
        else{

        }
    }
        return numberOfPrimeNumbers;
    }
}
