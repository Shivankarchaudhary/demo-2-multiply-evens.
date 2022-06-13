package com.jap.recursion;

public class MultiplyEvens
{
    public long multiplyEvens(int n)
    {
        if(n<0){
            return -1;
        }
        if(n==0) {
            return 1;
        }
        if(! (n % 2 == 0)) {
            return multiplyEvens(n - 1);
        }
        else {
            return  n * multiplyEvens(n - 1);
        }
    }

    public static void main(String[] args) {
        MultiplyEvens me = new MultiplyEvens();
        int number = 1;
        System.out.println("The product of even numbers from 1 to "+number+" is ");
        System.out.print(me.multiplyEvens(number));
    }
}
