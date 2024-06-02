package designPatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThinCrustBase implements BasePizza{
    @Override
    public void prepare() {
        log.info("preparing base pizza in thin crust");
    }

    @Override
    public int makingCost() {
        return 30;
    }
}
