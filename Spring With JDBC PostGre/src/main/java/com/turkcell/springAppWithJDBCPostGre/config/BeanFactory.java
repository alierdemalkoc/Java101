package com.turkcell.springAppWithJDBCPostGre.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanFactory {
	
	@Bean(name = "datasource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/PostGreJDBC");
		dataSource.setUsername("postgres");
		dataSource.setPassword("6544");
		return dataSource;
	}
	
	@Bean(name = "namedParameterJdbcTemplate")
	@DependsOn(value = "datasource")
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(
			@Autowired @Qualifier(value = "datasource") DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
	}

}
