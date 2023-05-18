package template_method.concrete;

import template_method.CaffeineBeverage;

public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding suger and milk");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
