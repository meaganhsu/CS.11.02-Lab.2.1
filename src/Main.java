public class Main {

    public static void main(String[] args) {
        //System.out.println(add(4,3));
        //System.out.println(add(3,6,2,9));
        //System.out.println(morningGreeting("Meagan"));
        //System.out.println(afternoonGreeting("Meagan"));
        //System.out.println(triple("hi ");
        //System.out.println(half(40));
        //System.out.println(roundPositiveValueToNearestInteger(3.5165));
        //System.out.println(roundNegativeValueToNearestInteger(-5.58982));
    }

    static int add(int num1, int num2) {    //return type = int, two parameters
        return num1 + num2;    //returning sum of two values
    }
    static int add(int var1, int var2, int var3, int var4) {    //return type = int, four parameters
        int sum = add(add(var1, var2),add(var3, var4));    //using add() thrice
        return sum;    //returning sum of four values
    }
    static String morningGreeting(String name1) {    //return type = String, one parameter
        return "早上好, " + name1 + "!";    //returning the greeting using string concatenation
    }
    static String afternoonGreeting(String name2) {    //return type = String, one parameter
        return "下午好, " + name2 + "!";    //returning greeting using string concatenation
    }
    static String triple(String word) {    //return type = String, one parameter
        return word + word + word;    //using string concatenation to triple the String
    }
    static double half(double halfNum) {    //return type = double, one parameter
        return (halfNum / 2);    //dividing value by two
    }
    static int roundPositiveValueToNearestInteger(double posNum) {    //return type = int, one parameter
        return (int) (posNum + 0.5);    //adding 0.5 and returning the int value (rounding it to the nearest integer)
    }
    static int roundNegativeValueToNearestInteger(double negNum) {    //return type = int, one parameter
        return (int) (negNum - 0.5);    //adding 0.5 and returning the int value (rounding it to the nearest negative integer)
    }
}