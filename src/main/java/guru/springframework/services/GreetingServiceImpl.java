package guru.springframework.services;

public class GreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello everyone from Base Service";
  }
}