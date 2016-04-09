package Problems1_50;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by marlinl on 4/8/2016.
 */
public class Problem3 {
    /*
        The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number 600851475143 ?
    */
    public static void main(String[] args) {
        //big integer of 600851475143
        BigInteger n = new BigInteger("600851475143");
        //create array of n size
        ArrayList<BigInteger> list = new ArrayList<>();
        for (BigInteger i = BigInteger.ONE.add(BigInteger.ONE); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            list.add(i);

        }





    }

}
