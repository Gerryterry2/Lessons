package Lesson1;


public  class Treadmill implements Obstacles{
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }



    @Override
    public boolean passObstacle(Participant participant) {
        if(participant.run() >= length) {
            System.out.println(participant + "пробежал");
        return true;
        }
        else {
            System.out.println(participant + "не смогу пробежать" + length);
        }
        return false;
    }
}






