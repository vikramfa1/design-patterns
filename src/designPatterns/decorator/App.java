package designPatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {


    public static void main(String args[]) {
        BasePizza basePizza = new Seasoning(new Toppings(new ThinCrustBase()));
        basePizza.prepare();
        int cost = basePizza.makingCost();
        log.info("making  cost of pizza: {}",cost);
    }

}
