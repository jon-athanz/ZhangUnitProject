public class Computer {
    private int max;
    private int min;
    private boolean won;

    public Computer(int maximum, int minimum) {
        max = maximum;
        min = minimum;
        won = false;

    }

    public Computer() {
        min = 1;
        max = 100;
        won = false;
    }

    public int randomNum() {
        int randonNum = (int) (Math.random() * (max - min)) + min;
        return randonNum;
    }

    public void numberChecker(int guess) {
        if (guess > randomNum()) {
            System.out.println("Lower");
        } else if (guess < randomNum()) {
            System.out.println("Higher");
        } else {
            System.out.println("You got it!");
            won = true;
        }
    }



}
