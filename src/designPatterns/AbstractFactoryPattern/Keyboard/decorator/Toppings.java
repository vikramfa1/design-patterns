package designPatterns.AbstractFactoryPattern.Keyboard.decorator;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

@Slf4j
public class Toppings implements BasePizza{

    BasePizza basePizza;
    public Toppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public void prepare() {
        basePizza.prepare();
        log.info("adding toppings");
    }

    @Override
    public int makingCost() {
        return basePizza.makingCost()+30;
    }
}
