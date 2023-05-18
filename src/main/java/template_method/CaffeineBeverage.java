package template_method;

public abstract class CaffeineBeverage {

    /**
     * Template method
     */
    protected final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments())
            addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 掛鉤，可讓子類別自由選擇實作
     * @return
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
}
