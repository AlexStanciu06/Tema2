import java.util.concurrent.Semaphore;
import java.util.ArrayList;
import java.lang.Math;

public class Orientation extends Thread
{
    private Semaphore semaphore;
    private String orientation;
    private ArrayList<TheCar> car;

    public Orientation(Semaphore semaphore, String orientation, ArrayList<TheCar> car)
    {
        this.semaphore = semaphore;
        this.orientation = orientation;
        this.car = car;
    }
}
