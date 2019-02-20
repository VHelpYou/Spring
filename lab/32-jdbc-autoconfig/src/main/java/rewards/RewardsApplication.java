package rewards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// TODO-01 : Open pom.xml or build.gradle, look for TO-DO-01

// TODO-02 : In pom.xml or build.gradle, look for TO-DO-02

// TODO-03 : Turn the RewardsApplication into a Spring Boot application
//           by adding an annotation.

// TODO-11 : Disable the `DataSource` auto-configuration using the
//           @SpringBootApplication exclude attribute - this was
//           the positive match we asked you to remember earlier.

// TODO-12 : Look in application.properties for the next step.

// TODO-13 : Remove the `DataSource` auto-configuration exclusion.
//           Rerun the test again.
//           Spring Boot auto-configuration should be creating the DataSource again.

// TODO-14 : Look in application.properties for the next step.

@SpringBootApplication(scanBasePackages= {"config"}/*,exclude= {DataSourceAutoConfiguration.class}*/)
public class RewardsApplication {
	static final String SQL = "SELECT count(*) FROM T_ACCOUNT";
	
    final Logger logger
            = LoggerFactory.getLogger(RewardsApplication.class);
    
    public static void main(String[] args) {
		SpringApplication.run(RewardsApplication.class, args);
	}

    @Component
    public class SpringApplicationRunner implements CommandLineRunner {
    	
    	JdbcTemplate jdbcTemplate;
		
		public static final String QUERY = "SELECT count(*) FROM T_ACCOUNT";
		
		
		public SpringApplicationRunner(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			 System.out.println("Hello, there are "
	                   + jdbcTemplate.queryForObject(QUERY, Long.class)
	                   + " accounts");
		}
    	
    }
    // TODO-05 : Move the SQL scripts from the
    //             `src/test/resources/rewards/testdb` to the
    //             `src/main/resources/`
    //  Why are you doing this?  See detailed instructions if you do not know.

    // TODO-06 : Setup a command line runner that will query count from
    //           T_ACCOUNT table and log the count to the console
    //           Use the SQL query and logger provided above.
    //           Use the JdbcTemplate bean that Spring Boot creates for you
    //           automatically.
    //
    // TODO-07   Enable full debugging - follow TO-DO-07 in application.properties
    //           then come back here.
    //
    //           Run the application - do you see the accounts log message?
    //           In the console output, find "CONDITIONS EVALUATION REPORT"
    //           What is the first positive match? REMEMBER its name.
    
    // TODO-08   Follow the instructions in the detailed instructions.
    //           The section titled "Build and Run using Command Line tools".
}
