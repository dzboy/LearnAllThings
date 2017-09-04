package cn.loftlab.android_test.inject_test_coffee;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
  @Singleton
  @Component(modules = { DripCoffeeModule.class })
  public interface Coffee {
    CoffeeMaker maker();
  }

  public static void main(String[] args) {
//    Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
//    coffee.maker().brew();
      Coffee coffee = DaggerCoffeeApp_Coffee.create();
    CoffeeMaker cm1 = coffee.maker();

    Coffee coffee2 = DaggerCoffeeApp_Coffee.create();
    CoffeeMaker cm3 = coffee2.maker();
    System.out.print(cm1.getHeater() + "  " + cm3.getHeater());
  }
}
