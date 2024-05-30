package Week7;

public class Bike extends Vehicle {

    boolean isRaceable;

    @Override
    void moveForward() {
        System.out.println("오토바이 앞으로 전진");
    }

    public void stunt() {
        System.out.println("오토바이로 묘기 부리기");
    }
}
