Why under /WEB-INF/views/?

This is a security convention — files under WEB-INF can’t be accessed directly from the browser.
So users can’t go to localhost:8080/views/home.jsp directly.


Now to run and test this solely on Spring we add this plugin in pom.xml
<build>
<plugins>
<plugin>
<groupId>org.eclipse.jetty</groupId>
<artifactId>jetty-maven-plugin</artifactId>
<version>9.4.53.v20231009</version>
<configuration>
<scanIntervalSeconds>10</scanIntervalSeconds>
</configuration>
</plugin>
</plugins>
</build>
Then run ---> mvn jetty:run
