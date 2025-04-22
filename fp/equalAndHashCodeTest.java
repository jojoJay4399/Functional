package fp;

import java.util.*;

public class equalAndHashCodeTest {

    public static void main(String[] args) {
        List<Car> carsList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            //carsList.add(new fp.Car())
            carsList.add(new Car("2000", "XXX", "JAY"));
        }


        carsList.stream()
                .distinct().forEach(System.out::println);
    }
}
