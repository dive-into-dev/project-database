package dive.dev.dbconnection;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DatabaseConnection {
	
	  //@Bean(name = "mariadbDataSource") 
	  public DataSource mariadbDataSource(){
		  return DataSourceBuilder.create()
		  .url("jdbc:mariadb://localhost:3306/project_db") .username("root")
		  .password("root") .build(); 
	  }
}
