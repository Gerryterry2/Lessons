package Lesson1;

public class Wall implements Obstacles{
    private final int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if(participant.jump() >= height) {
            System.out.println(participant + "перепрыгнул");
            return true;
        }
        else {
            System.out.println(participant + "не смогу перепрыгнуть" + height);
        }
        return false;
    }
}