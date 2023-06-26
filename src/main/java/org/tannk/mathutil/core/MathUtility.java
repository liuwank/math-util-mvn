/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tannk.mathutil.core;

/**
 *
 * @author Predrir
 */
//class clone lai 100% class java.util.Math cua JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.1415;

    //tinh n! = 1.2.3...n
    //thiết kế/quy ước cho hàm / method này
    //0! = 1! = 1
    //không áp dụng giai thừa cho số âm. Nếu n < 0 => DED; ném ra exception
    //không áp dụng cho giai thừa số > 20. Vì 20! vừa đủ khít kiểu long (18 con số 0)
    //21! => chửi, ném ra exception
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be between 0 => 20");
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long product = 1; //tích khởi đầu là 1
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        } return product;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 => 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
