package designPatterns.AbstractFactoryPattern.Keyboard.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Seasoning implements BasePizza{

    BasePizza basePizza;

    public Seasoning(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public void prepare() {
        basePizza.prepare();
        log.info("adding seasoning");
    }

    @Override
    public int makingCost() {
        return basePizza.makingCost()+45;
    }
}
