package Lesson1;

public class Cat implements Participant {

    private final int runLength;
    private final int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public int jump() {
        System.out.printf("Кот перепрыгнул %d%n", jumpHeight);
        return jumpHeight;


    }

    @Override
    public int  run() {
        System.out.printf("Кот пробежал %d%n", runLength);
        return runLength;

    }
}
