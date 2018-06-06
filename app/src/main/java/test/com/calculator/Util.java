package test.com.calculator;


public class Util {

    public long add (long num1 , long num2){
        long sum = 0 ;
        sum = num1 + num2 ;
        return sum;
    }

    public long subtract (long num1 , long num2){
        long sub = 0;
        sub = num1 - num2 ;
        return sub ;
    }

    public long multiply (long num1 , long num2){
        long mul = 0;
        mul = num1 * num2 ;
        return mul ;
    }

    public long devide (long num1 , long num2){
        long dev = 0;
        if (num2 !=0){
            dev = num1/num2;
        }
        return dev;
    }
}
