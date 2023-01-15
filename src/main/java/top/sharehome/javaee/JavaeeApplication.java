package top.sharehome.javaee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.sharehome.javaee.mapper")
public class JavaeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaeeApplication.class, args);
    }

}
