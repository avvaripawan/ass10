package ass9;

/**
 * Given a binary string that contains a sequence of 1's and 0's, returns an
 * equivalent to the decimal value in integer form.
 *
 * Input : 1010
 * Output : 10
 *
 * Input : 000000000000001010
 * Output : 10
 *
 * @author Siva Sankar
 */

public class BinaryToDecimal {

    /**
     * This method reads in a Binary String and returns the equivalent to the
     * decimal value of the binary string.
     * @param s, the binary string that contains only sequence of 1's and 0's.
     * @return the decimal number n of the binary string.
     */
    public static long binaryToDecimal(String bnum)
    {
        long sum = 0;
        for (int index = 0; index < bnum.length(); index++)
        {
            sum += ((long)Math.pow(2,index)*Long.parseLong(""+bnum.charAt(bnum.length()-index-1)));
        }
        return sum;
    }
}
