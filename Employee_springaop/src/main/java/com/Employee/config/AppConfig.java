package com.Employee.config;

import com.Employee.persistence.EmployeeDao;
import com.Employee.persistence.EmployeeDaoImp;
import com.Employee.aspect.EmployeeService;
import com.Employee.aspect.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.Employee")
@EnableAspectJAutoProxy
public class AppConfig<MethodLogger> {
    @Bean
   public MethodLogger methodLogger() {
       return new MethodLogger();
    }
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }
    @Bean
    public EmployeeDao employeeDao() {
        return new EmployeeDaoImp();
    }
}
