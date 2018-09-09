import java.util.Random;

public class MaxThisSameNumberInRow {

   static int[][] returnTabWithRandomInt (int maxIntInField,int size){
        int tabToReturnInRandomInt[][] = new int[size][size];
        Random random = new Random();
        for(int i = 0; i < tabToReturnInRandomInt.length;i++){
            for (int j = 0; j< tabToReturnInRandomInt[i].length;j++){
                tabToReturnInRandomInt[i][j] = random.nextInt(maxIntInField);
            }
        }
        return tabToReturnInRandomInt;
    }

    static void printTab(int[][] tab){
        for(int i = 0; i < tab.length;i++){
            for (int j = 0; j< tab[i].length;j++){
                System.out.print(tab[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
