package Lesson1;


public  class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    boolean doRun(int runLength) {
       return runLength >= length;
    }
}






