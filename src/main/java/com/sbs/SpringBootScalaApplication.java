package com.sbs;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 学习用
 */
//@SpringBootApplication
//排异类
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class SpringBootScalaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootScalaApplication.class, args);
    }
}
