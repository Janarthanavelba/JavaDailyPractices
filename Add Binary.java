//Given two binary strings a and b, return their sum as a binary string.
//Using BigInteger variable.

import java.math.BigInteger; //Must Import java.math.BigInteger package

class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger num1 = new BigInteger(a, 2);  
        BigInteger num2 = new BigInteger(b, 2);

       BigInteger res = num1.add(num2);

        return res.toString(2);
    }
}
