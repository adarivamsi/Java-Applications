/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productkey;

/**
 *
 * @author adari
 */
public class ProductKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String S = "2-4a0r7-4k";
        int K = 4;
        System.out.println(format(S,K));
    }
    
    public static String format(String S, int K) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < S.length(); i ++) {
            if (S.charAt(i) != '-') {
                builder.append(S.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        String ori = builder.toString();

        int i = ori.length() - 1;
        int stop = (ori.length() - 1) % K;

        while (i >= 0) {
            if (i % K == stop && i != ori.length() - 1)
                result.append('-');
            result.append(Character.toUpperCase(ori.charAt(i)));
            i--;
        }
        return result.reverse().toString();
    }
    
}
