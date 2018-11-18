package test.com.calculator;


public class Util {

    public double add (double num1 , double num2){
        double sum = 0 ;
        sum = num1 + num2 ;
        return sum;
    }

    public double subtract (double num1 , double num2){
        double sub = 0;
        sub = num1 - num2 ;
        return sub ;
    }

    public double multiply (double num1 , double num2){
        double mul = 0;
        mul = num1 * num2 ;
        return mul ;
    }

    public double devide (double num1 , double num2){
        double dev = 0;
        if (num2 !=0){
            dev = num1/num2;
        }
        return dev;
    }
}
