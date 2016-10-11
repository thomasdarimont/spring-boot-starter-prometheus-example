package de.tdlabs.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface PrometheusExampleApplication {

    static void main(String... args) {
        SpringApplication.run(PrometheusExampleApplication.class, args);
    }
}
