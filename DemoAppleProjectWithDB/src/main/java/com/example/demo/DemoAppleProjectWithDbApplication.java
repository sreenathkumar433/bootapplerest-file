package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.property.FileStorageProperties;

	
/*@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class,
		  DataSourceTransactionManagerAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.example.demo.DAO")*/
@SpringBootApplication
@ComponentScan("com.example.demo")
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class DemoAppleProjectWithDbApplication {
	

	public static void main(String[] args) {
		System.out.println(" ************* srun");
		SpringApplication.run(DemoAppleProjectWithDbApplication.class, args);
	}

}
