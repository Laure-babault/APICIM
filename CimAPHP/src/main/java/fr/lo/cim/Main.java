package fr.lo.cim;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import fr.lo.cim.entity.Maladie;
import fr.lo.cim.repository.MaladieRepository;
import fr.lo.cim.service.MaladieService;

@SpringBootApplication
@ComponentScan(basePackages = { "fr.lo.cim" })
@EnableJpaRepositories(basePackages = { "fr.lo.cim.repository" })
@EntityScan(basePackages = { "fr.lo.cim.entity" })
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);

		
		
		/*System.out.println("Veuillez saisir une maladie");
		Scanner sc = new Scanner(System.in);
		String malsc = sc.next();
		sc.close();*/

		

	}

	@Component
	public class FirstCommandLineRunner implements CommandLineRunner {
		
		@Autowired
		private MaladieService maladieService;
		
		private Maladie maladie;
		
	    @Override
	    public void run(String... args) throws Exception {
	        System.out.println("Running First CommandLineRunner");
	 
	        String malsc = "A00";
			
			System.out.println(malsc);
			
			maladie = maladieService.searchService(malsc);
			
			
			System.out.println(maladieService.enfantService(maladie));
			
	    }
	}
}
