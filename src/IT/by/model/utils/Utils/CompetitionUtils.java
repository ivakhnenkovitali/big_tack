package IT.by.model.utils.Utils;


import IT.by.model.Cat;
import IT.by.model.Dog;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@UtilityClass
public class CompetitionUtils {
        final String PATH_TO_FILE ="src/IT/by/model/resources/animals.txt";

    public static void  parseFile(List<Cat> cats, List<Dog> dogs,
                                  Map<String, String> errors){
        try (Scanner sc = new Scanner(new FileReader(PATH_TO_FILE))){
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.printf("File hasn't found by path %s %n", PATH_TO_FILE );
            System.exit(1);
        }

    }

}
