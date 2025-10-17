package org.appMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // This auto registers things like -
// 1.) DispatcherServlet --> Handling requests
// 2.) @Controller Mappings, @RequestMapping, @GetMapping, etc.
// 3.) Message converters (for JSON/XML, etc.)
@ComponentScan(basePackages = "org")
public class AppConfig {

    @Bean
    public ViewResolver viewResolver() // Method that Spring uses to find .jsp files.

    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // Creates a resolver object that maps logical view names (like "home") to real JSP paths.

        resolver.setPrefix("/WEB-INF/views"); // Adds the path after the view name.
        resolver.setSuffix(".jsp"); // Adds extension after view name for example : success.jsp.
        return resolver;
        // Whenever the controller returns /home ----->
        // Spring does - prefix + "home" + suffix = = /WEB-INF/views/success.jsp
    }
}
