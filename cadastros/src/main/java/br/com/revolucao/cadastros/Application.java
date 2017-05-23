package br.com.revolucao.cadastros;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: Cesar Searlini
 */
@SpringBootApplication(scanBasePackages = "br.com.revolucao.cadastros")
@EnableEurekaClient
@EnableWebMvc
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        rotinaBancoDeDados();
    }

    @Bean
    protected DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(PropertiesConfig.DB_DRIVER);
        dataSource.setUrl(PropertiesConfig.DB_HOST_NAME);
        dataSource.setUsername(PropertiesConfig.DB_USER);
        dataSource.setPassword(PropertiesConfig.DB_PASS);
        return dataSource;
    }

    private static void rotinaBancoDeDados() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(PropertiesConfig.DB_HOST_NAME, PropertiesConfig.DB_USER, PropertiesConfig.DB_PASS);
        flyway.setBaselineOnMigrate(true);
        flyway.migrate();
    }

}
