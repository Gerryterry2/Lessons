package Lesson1;

public class Wall extends Barriers {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    boolean doJump(int jumpHeight) {
        return  jumpHeight >=  height;
    }
}