public class Computer {
    private int max;
    private int min;
    private int randomNum;

    private String firstName;
    private int first;

    public Computer(int maximum, int minimum) {
        max = maximum;
        min = minimum;
        randomNum = 0;

    }
    public Computer() {
        min = 1;
        max = 100;
        randomNum = 0;

    }

    public int getRandomNum() {
        return randomNum;
    }
    public void randomNum() {
        randomNum = (int) ((Math.random() * (max - min))) + min;
    }


    public void numberChecker(int guess) {
        if (guess > getRandomNum()) {
            String position = "Lower";
            System.out.println(position);
        } else if (guess < getRandomNum()) {
            String position = "Higher";
            System.out.println(position);
        } else {
            String position = "You got it!";
            System.out.println(position);
        }
    }

    public boolean winnerChecker(int guess) {
        if (guess == getRandomNum()) {
            return false;
        } else {
            return true;
        }
    }

    public void setScore(int count, String name) {
        first = count;
        firstName = name;
    }

    public void checkLeaderBoardScore(int count, String name) {
        if (count < first && count > 0) {
            first = count;
            firstName = name;
        }
    }

    public String toString() {
        return firstName + ": " + first + " tries";
    }

    public String leaderBoard() {
        String leaders = "The person with the highest score is: " + firstName + "\nWith " + first + " Tries!!!!";
        return leaders;
    }

}
