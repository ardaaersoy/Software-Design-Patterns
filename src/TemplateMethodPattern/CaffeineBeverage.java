package TemplateMethodPattern;

public abstract class CaffeineBeverage {
    // --> this is final because we don’t want our subclasses to be able to override
    // this method and change the recipe
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        // --> If the customer WANTS condiments, only then do we call addCondiments().
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // --> Because Coffee and Tea handle these methods in different ways, they’re going to
    // have to be declared as abstract
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // --> This is a hook because the subclass can override this method, but does not have to.
    boolean customerWantsCondiments() {
        return true;
    }
}