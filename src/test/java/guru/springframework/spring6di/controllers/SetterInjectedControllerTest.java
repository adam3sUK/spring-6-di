package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(setterInjectedController.sayHello());
  }
}
