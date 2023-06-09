import java.util.Random;

public class RandomPassword {

    RandomWords randomWords;
    RandomNumbers randNums;

    public RandomPassword(RandomWords randomWords, RandomNumbers randNums) {
        this.randomWords = randomWords;
        this.randNums = randNums;
    }

    StringBuilder str = new StringBuilder();
    Random randomInstance = new Random();

    public String printPW() {

            for (int x = 0; x < 5; x++)
            {
                if (randomInstance.nextInt(1,2)==2)
                {
                    str.append((char) ('a' + randomInstance.nextInt(26)));
                }
                else
                {
                    str.append(randomInstance.nextInt(900000) + 100000);
                }
            }

        return str.toString();
    }
}


