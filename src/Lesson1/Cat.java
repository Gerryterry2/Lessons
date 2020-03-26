package Lesson1;

public class Cat implements Do {

    private int runLength;
    private int jumpHeight;

    public Cat(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }


    @Override
    public int jump() {
        System.out.println("Кот перепрыгнул");
        return jumpHeight;


    }

    @Override
    public int  run() {
        System.out.println("Кот пробежал");
        return runLength;

    }
}
