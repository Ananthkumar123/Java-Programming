package com.basicprograms.loops;
//while
public class Armstrong {

    public static void main(String[] args) {
        int num = 123, count = 0, x = num, temp = 0, sum = 0;
        
        // First loop to count the number of digits
        while (num > 0) {
            int rem = num % 10;
            temp = rem;
            count++;
            num /= 10;  // Update num here to avoid infinite loop
        }
        
        num = x;  // Reset num to the original value
        
        // Second loop to calculate the Armstrong number
        while (num > 0) {
            int rem = num % 10;
            temp = rem;
            int sq = (int) Math.pow(temp, count);
            sum += sq;
            System.out.println("square is " + sq);
            System.out.println("sum is " + sum);
            num /= 10;  // Update num here to move to the next digit
        }

        // Check if the number is an Armstrong number 
        System.out.println(x==sum?"it is armstrong ":"it is not armstrong");
        
    }
}
