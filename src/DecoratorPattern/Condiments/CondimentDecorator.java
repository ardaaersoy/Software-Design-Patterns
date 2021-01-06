package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}