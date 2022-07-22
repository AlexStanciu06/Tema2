import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<TheCar> carN_S = new ArrayList<>();
        ArrayList<TheCar> carW_E = new ArrayList<>();

        Semaphore S_NS = new Semaphore(1);
        Semaphore S_WE = new Semaphore(1);


    }
}