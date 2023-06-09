import java.util.ArrayList;
import java.util.List;
import java.util.Random;




public class Main {
    public static void main(String[] args) {


        RandomWords randomWords = new RandomWords();

        RandomNumbers randNums = new RandomNumbers();

        RandomPassword password = new RandomPassword(randomWords, randNums);


        System.out.println(password.printPW());

    }
}

