package com.kanth.jpa_tx_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaTxAppApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	= SpringApplication.run(JpaTxAppApplication.class, args);
     int n = context.getBeanDefinitionCount();

	 System.out.println("Beans created = "+ n);

	 Employee emp =new Employee();
	 emp.setEmpName("Kanth");
	 emp.setAge(25);

	 Employee emp1 =new Employee();
	 emp1.setEmpName("vardhan");
	 emp1.setAge(24);


	 IEmpRepo repo = context.getBean(IEmpRepo.class);

	 repo.save(emp);
	 repo.save(emp1);



	}

}
