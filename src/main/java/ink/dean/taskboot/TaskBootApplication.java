package ink.dean.taskboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaskBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskBootApplication.class, args);
    }

}
