package template_method;

import org.junit.jupiter.api.Test;
import template_method.concrete.Coffee;
import template_method.concrete.Tea;

public class TemplateMethodTest {

    @Test
    public void testTemplateMethod() {

        Tea tea = new Tea();

        tea.prepareRecipe();
    }

    @Test
    public void testHook() {

        Coffee coffee = new Coffee();

        coffee.prepareRecipe();
    }
}
