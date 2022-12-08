public class Computer {
    private int max;
    private int min;
    private int randomNum;

    private String firstName;
    private int first;
    private String secondName;
    private int second;
    private String thirdName;
    private int third;

    public Computer(int maximum, int minimum) {
        max = maximum;
        min = minimum;
        randomNum = 0;
        first = 50;
        second = 100;
        third = 150;

    }
    public Computer() {
        min = 1;
        max = 100;
        randomNum = 0;
        first = 50;
        second = 100;
        third = 150;

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

    public void checkLeaderBoardScore(int count, String name) {
        if (count < first) {
            second = first;
            third = second;
            first = count;
            firstName = name;
        } else if (count < second) {
            third = second;
            second = count;
            secondName = name;
        } else if (count < third) {
            third = count;
            thirdName = name;
        }
    }

    public String leaderBoard() {
        String leaders = "First Place = " + firstName + " | Score = " + first;
        leaders += "\nSecond Place = " + secondName + " | Score = " + second;
        leaders += "\nThird Place = " + thirdName + " | Score = " + third;

        return leaders;
    }
}
