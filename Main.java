import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "input.txt";
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter("\n");
        Integer line = 1;
        Map map = new Map();

        // Read neighbors
        while (scanner.hasNext() && line <= 19) {
            String lineText = scanner.next();
            String[] splitted = lineText.split("\\s+");

            for (int neighborsCount = 1; neighborsCount < splitted.length; neighborsCount++) {
                map.getCountries().get(line - 1).addNeighbor(map.getCountries().get(Integer.parseInt(splitted[neighborsCount]) - 1));
            }
            line++;
        }

        // Read the 20th line
        String[] splitted = scanner.next().split("\\s+");
        Integer answerPairs = Integer.parseInt(splitted[0].toString());
        List<List<Integer>> pairs = new ArrayList<List<Integer>>(answerPairs);
        line++;

        // Read country pairs
        while (scanner.hasNext() && answerPairs > 0) {
            String lineText = scanner.next();
            splitted = lineText.split("\\s+");
            ArrayList<Integer> pair = new ArrayList<Integer>(2);

            pair.add(Integer.parseInt(splitted[0]));
            pair.add(Integer.parseInt(splitted[1]));
            pairs.add(pair);

            answerPairs--;
            line++;
        }

        System.out.println(pairs);

        scanner.close();

        System.out.println(map);
    }
}