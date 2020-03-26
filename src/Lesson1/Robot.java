package Lesson1;

public class Robot implements Do {

    private int runLength;
    private int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public int jump() {
        return 0;
    }

    @Override
    public int run() {
        return 0;
    }
}
