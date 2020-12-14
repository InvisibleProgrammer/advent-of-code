import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args)  {
        List<Integer> numbers = new ArrayList<>();

        InputStream stream = Day1.class.getClassLoader().getResourceAsStream("input.txt");


        Scanner scanner = new Scanner(stream);

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Integer number = Integer.valueOf(line);

            numbers.add(number);
        }

        scanner.close();

        // Part one
        for (int i = 1; i < numbers.size(); i++){
            for (int j = 0; j < i; j++){
                if (numbers.get(i) + numbers.get(j) == 2020){
                    System.out.println("Part one: " + numbers.get(i) * numbers.get(j));

                    break;
                }
            }
        }

        // Part two
        for (int i = 2; i < numbers.size(); i++){
            for (int j = 1; j < i; j++){
                for (int k = 0; k < j; k++){
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020){
                        System.out.println("Part two: " + (long) numbers.get(i) * (long) numbers.get(j) * (long) numbers.get(k));

                        break;
                    }
                }
            }
        }
    }

}
