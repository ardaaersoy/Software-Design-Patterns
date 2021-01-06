package TemplateMethodPattern;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = "yes"; // yes, no
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        }
        return false;
    }
}
