package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    // public int countOccurences(String num, char c) {

    //     int count = 0;
    //     for (int i = 0; i < num.length(); i++) {
    //         if (num.charAt(i) == c) {
    //             count++;
    //         } 
    //     }
    //     return count;
    // }

    public int deluxe(int number) {

        if (number > 10) {

            String num = number + "";
            //int occurences = countOccurences(num, num.charAt(0));
            // if (occurences == num.length() ) {
                if (number%2 == 0) {
                    return 0;
                } else {
                    return 1;
                }
           // }
        }
        return -1;
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
        int deluxeNumber = deluxe(number) ;
 
        if ( (number%3 == 0 && containsThree) &&
            (number%5 == 0 && containsFive) ) {
            if (deluxeNumber == 0) {
                return "fizz buzz deluxe";
            } else if (deluxeNumber == 1) {
                return "fizz buzz fake deluxe";
            } else {
                return "fizz buzz";
            }
        } else if (number%3 == 0 && containsThree) {
            if (deluxeNumber == 0) {
                return "fizz deluxe";
            } else if (deluxeNumber == 1) {
                return "fizz fake deluxe";
            } else {
                return "fizz";
            }
        } else if (number%5 == 0 && containsFive) {
            if (deluxeNumber == 0) {
                return "buzz deluxe";
            } else if (deluxeNumber == 1) {
                return "buzz fake deluxe";
            } else {
                return "buzz";
            }
        } else if (deluxeNumber == 0) {
            return "deluxe";
        } else if (deluxeNumber == 1) {
            return "fake deluxe";
        } else {
            return number + "";
        }
    }

}
