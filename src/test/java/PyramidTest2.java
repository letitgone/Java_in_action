import java.util.Scanner;public class PyramidTest2 {    /**     *      1     *     121     *    12321     *   1234321     *  123454321     * 12345654321     */    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        int n= input.nextInt();        for (int i = 1; i <= n; i++) {            for (int j = 0; j < n - i; j++) {                System.out.print(" ");            }            for (int j = 1; j < i; j++) {                System.out.print(j);            }            for (int j = i; j > 0; j--) {                System.out.print(j);            }            System.out.println();        }    }}