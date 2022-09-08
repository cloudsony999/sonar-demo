package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkindemoApplication {
//implements CommandLineRunner 
//	@Autowired
//	private TutorialRepository tutorialRepository;

	public static void main(String[] args) {
		SpringApplication.run(JenkindemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Tutorial t1 = new Tutorial();
//		t1.setTitle("java");
//		t1.setDescription("Core Java OCJP");
//		t1.setPublished(true);
//		tutorialRepository.save(t1);
//		Tutorial t2 = new Tutorial();
//		t2.setTitle("sql");
//		t2.setDescription("Oracle");
//		t2.setPublished(true);
//		tutorialRepository.save(t2);
//		System.out.println("---------saved------------");
//
//	}

}
