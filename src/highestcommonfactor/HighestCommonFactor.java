/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highestcommonfactor;

/**
 *
 * @author sylvester
 */
public class HighestCommonFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {10, 50, 60, 100};
        int highestCommonFactor = highestCommonFactor(numbers);
        System.out.println(highestCommonFactor);
    }
    
     public static int highestCommonFactor(int[] numbers) {
        int hcf = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            hcf = highestCommonFactor(hcf, numbers[i]);
        }
        return hcf;
    }

    public static int highestCommonFactor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return highestCommonFactor(b, a % b);
        }
    }
    
}
