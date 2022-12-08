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
            System.out.println("Lower");
        } else if (guess < getRandomNum()) {
            System.out.println("Higher");
        } else {
            System.out.println("You got it!");
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
        if (count < first) {
            first = count;
            firstName = name;
        }
    }

    public String leaderBoard() {
        String leaders = "The person with the highest score is " + firstName + ", with " + first + " tries.";
        return leaders;
    }

}
