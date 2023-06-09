import java.util.Random;
import java.util.random.RandomGenerator;


public class RandomWords
{

    Random randomInstance = new Random();

    public String returnRandomWord(){

        StringBuilder str = new StringBuilder();

        for(int x = 0; x<5; x++){
            str.append((char)('a' + randomInstance.nextInt(26)));
        }

return str.toString();

    }

}





