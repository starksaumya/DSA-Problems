class Solution {
    //Multiply Strings
    //Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
    //
    //Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
    //
    //
    //
    //Example 1:
    //
    //Input: num1 = "2", num2 = "3"
    //Output: "6"
    //Example 2:
    //
    //Input: num1 = "123", num2 = "456"
    //Output: "56088"
    public String multiply(String num1, String num2) {
        int m = num1.length(),
            n =num2.length();
        int[] pos = new int[m + n];

        for(int i = m-1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j-- ){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;

            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int p : pos)
            if(!(stringBuilder.isEmpty() && p == 0))
                stringBuilder.append(p);
        return stringBuilder.isEmpty() ? "0" : stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        System.out.println(soln.multiply("123","456"));
    }
}