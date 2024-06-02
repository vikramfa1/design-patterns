package designPatterns.adaptor;

import java.util.*;
import java.util.stream.Collectors;

public class ManualCar {
    public void accelerate() {
        System.out.println("accelerate");
    }

    public void gear(String direction) {
        System.out.println("gearing "+direction);
    }
}
