package pattern.template_method;

public class CaffeApp {

  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    tea.prepareRecipe();
    coffee.prepareRecipe();
  }
}
