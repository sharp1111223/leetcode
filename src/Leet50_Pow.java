public class Leet50_Pow {
    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        if (n < 0){
            /**
             * 注意此处要判断整数类型的越界情况，因为范围为[-2^31, 2^31-1]，所以需要考虑
             * n < 0时，为-2^31的情况，所以将一个1/x，单独拿出来，这样就不是2^31了，变为2^31 - 1
             * 就不存在数组越界的情况了
             */
            if(n==Integer.MIN_VALUE)
            {
                return 1/x * myPow(1/x,Integer.MAX_VALUE);
            }
            return  (1 / myPow(x, -n));
        }
        // 此处的巧妙方式是将一个数组分成二分的方式，这样把算法的复杂度转化为log(n)
        // 偶数情况表示两组相等的数字相乘，如果是奇数，那么先减1之后，再转化成偶数
        if (n % 2 == 1){
            return x * myPow(x, n - 1);
        }
        return myPow(x * x, n / 2);

    }
    public static void main(String[] args){
       System.out.println(myPow(2.00000, 1));

    }
}
