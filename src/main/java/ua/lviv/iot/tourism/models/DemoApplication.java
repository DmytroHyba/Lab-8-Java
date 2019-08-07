package ua.lviv.iot.tourism.models;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

  }

  @Bean
      public CommandLineRunner demo(TourRepository repository) {
    return (args) -> {
      repository.save(new  Tour(440, 18.01, "Spain", "For family", Rating.OUTSOLD));
      repository.save(new  Tour(700, 12.01, "Egypt", "For maximum rest", Rating.EXPENSIVE));
      repository.save(new  Tour(610, 14.01, "Portugal", "For best rest", Rating.EXPENSIVE));
      repository.findAll().forEach(fishProducts -> System.out.println(fishProducts));
    };
  }

}
