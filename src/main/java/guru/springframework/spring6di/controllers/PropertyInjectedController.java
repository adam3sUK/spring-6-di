package guru.springframework.spring6di.controllers;

import guru.springframework.services.GreetingService;

public class PropertyInjectedController {
  
  GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
