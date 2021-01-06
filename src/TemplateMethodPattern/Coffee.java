package TemplateMethodPattern;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = "no"; // yes, no
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }
}
