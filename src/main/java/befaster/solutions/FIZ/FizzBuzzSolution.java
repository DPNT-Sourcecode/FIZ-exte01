package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

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
        if ( (number%3 == 0 && number%5 == 0) || 
            (containsThree && containsFive) ) {
            return "fizz buzz";
        } else if (number%3 == 0 || containsThree) {
            return "fizz";
        } else if (number%5 == 0 || containsFive) {
            return "buzz";
        } else {
            return number + "";
        }
    }

}
