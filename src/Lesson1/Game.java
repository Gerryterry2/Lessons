package Lesson1;

public class Game {
    private Obstacles[] obstacles;
    private Participant[] participants;

    public void setObstacles(Man man, Robot robot, Cat cat, Obstacles... obstacles){
        this.obstacles = obstacles;
    }

    public void setParticipants(Wall wall, Treadmill treadmill, Participant... participants) {
        this.participants = participants;
    }

    public void startGame() {
        System.out.println("Игра началась");
        for (Participant participant: participants) {
            boolean success = passAllObstacles(participant);
            if (!success) {
                System.out.println(participant + "покинул игру");
            }
            
        }
    }

    private  boolean passAllObstacles(Participant participant) {
        for (Obstacles obstacles: obstacles) {
            if (!obstacles.passObstacle(participant)) {
                return false;
            }
            System.out.println();
        }
        return true;
    }


}
