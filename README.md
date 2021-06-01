In this assignment, you will write two solutions for each algortihm that is stubbed out in the Challenges class.

- Solution #1: Will only be in psuedocode using the `//` syntax for each line 
  
- Solution #2: will be the actual code. 


After you have completed the code solutions, run the JUNIT tests with the matching method name. 

A fully completed section could look like the following:
```java
 /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     * Return the counts in a string separated by two ellipses (just like the example)
     * Handle bad user input (numbers that cannot be counted in that pattern) by returning "Try again with better numbers!"
     * Example:
     * Count from: 4
     * Count to  : 13
     * Count by  : 3
     *
     * 4.. 7.. 10.. 13
     *
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        // check that countTo is not greater than countFrom
        // return an error message if it is 
        if(countTo < countFrom){
            return "Try again with better numbers!";
        }
        // create variable to hold the answer temporarily
        StringBuilder answer= new StringBuilder();
        // loop to create pattern based on user inputs
        // starting at countFrom
        // loop until we reach our countTo number
        // increase the number at every cycle by our countBy number 
        for (int currentInt=countFrom; currentInt<=countTo; currentInt += countBy){
            // add the current number to our answer variable
            // separate with a .. and a space char
            answer.append(currentInt).append(".. ");
        }
        // remove the last three characters because they are extras
        answer.setLength(answer.length()-3);
        //return our answer as a String
        return answer.toString();
    }
```

Note that the pseudocode tells us when we need to declare variables & what they are. It also tells us when and how to iterate through a for loop.

Taken by itself, the pseudocode breaks down the problem into actionable steps. It is much easier to start coding if you already know the shape of the problem.
```java
// check that countTo is not greater than countFrom
// return an error message if it is
// create variable to hold the answer temporarily 
// loop to create pattern based on user inputs
// starting at countFrom
// loop until we reach our countTo number
// increase the number at every cycle by our countBy number  
// add the current number to our answer variable
// separate with a .. and a space char
// remove the last three characters because they are extras
//return our answer as a String

```

*** Bonus Challenge: Create a driver class that will use System.out.println and print the results of each algorithm in the terminal.

Submit your final answers vis google classroom
