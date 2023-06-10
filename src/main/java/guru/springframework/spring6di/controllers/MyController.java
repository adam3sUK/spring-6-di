package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController() {
    this.greetingService = new GreetingServiceImpl();
  }

  public String sayHello() {
    System.out.println("I am in the controller");

    return greetingService.sayGreeting();
  }
}
