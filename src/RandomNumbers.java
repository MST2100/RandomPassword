import java.util.Random;

public class RandomNumbers {

    Random randomInstance = new Random();

    public void return5RandomNumbers()
    {
            System.out.println((randomInstance.nextInt(900000) + 100000));
    }

}

