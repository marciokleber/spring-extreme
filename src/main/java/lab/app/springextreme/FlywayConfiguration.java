//package lab.app.springextreme;
//
//import org.flywaydb.core.Flyway;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
//import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//@Configuration
//@Order(Ordered.LOWEST_PRECEDENCE)
//public class FlywayConfiguration {
//    @Bean
//    @Order(Ordered.LOWEST_PRECEDENCE)
//    public FlywayMigrationStrategy flywayMigrationStrategy() {
//        return flyway -> {
//            // Configuração do Flyway
//            flyway.migrate();
//        };
//    }
//
//}
