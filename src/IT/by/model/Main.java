package IT.by.model;

import IT.by.model.exceoptons.CompetitionException;
import IT.by.model.utils.Utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        Map<String, String> errors = new HashMap<>();


        CompetitionUtils.parseFile(cats, dogs,  errors);
    }
}
