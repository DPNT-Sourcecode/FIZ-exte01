package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public int countOccurences(String num, char c) {

        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == c) {
                count++;
            } 
        }
        return count;
    }

    public boolean deluxe(int number) {

        if (number > 10) {

            String num = number + "";
            int occurences = countOccurences(num, num.charAt(0));
            if (occurences == num.length() ) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(int c, int number) {
        
        while (number != 0) {
            int a = number%10;
            if (a == c) {
                return true;
            }
            number = number/10;
        }
        return false;
    }

    public String fizzBuzz(Integer number) {
        boolean containsThree = contains(3,number);
        boolean containsFive = contains(5, number);
        if ( (number%3 == 0 || containsThree) &&
            (number%5 == 0 || containsFive) ) {
            if (deluxe(number)) {
                return "fizz buzz deluxe";
            } else {
                return "fizz buzz";
            }
        } else if (number%3 == 0 || containsThree) {
            return "fizz";
        } else if (number%5 == 0 || containsFive) {
            return "buzz";
        } else {
            return number + "";
        }
    }

}
