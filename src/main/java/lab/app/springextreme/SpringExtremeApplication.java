package lab.app.springextreme;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
public class SpringExtremeApplication implements CommandLineRunner {

	@Autowired
	private Flyway flyway;

	public static void main(String[] args) {
		SpringApplication.run(SpringExtremeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		flyway.baseline();
		flyway.migrate();
	}
}
