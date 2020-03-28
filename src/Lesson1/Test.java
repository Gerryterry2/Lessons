package Lesson1;

public class Test {


    public static void main(String[] args) {

        Cat cat = new Cat(100,2);
        Man man = new Man(1000,1);
        Robot robot = new Robot(10000,10);
        Wall wall = new Wall(10);
        Treadmill treadmill = new Treadmill(200);

        Game game = new Game();
        game.setObstacles(man, robot, cat);
        game.setParticipants(wall, treadmill);
        game.startGame();

    }



}
