1. Gerekli dependecyleri ekle

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
<dependency><!-- Optional, use this only when you need spring security taglibs -->
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-taglibs</artifactId>
</dependency>
```

2. App properties'e view prefixleri ekle (yaml örneği)

```yml
spring:
  mvc:
    view:
      prefix: /WEB-INF/
      suffix: .jsp
```

3. View resolver konfigürasyonu

```java
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${spring.mvc.view.prefix}")
    private String prefix;

    @Value("${spring.mvc.view.suffix}")
    private String suffix;

    /**
     * Configures view resolver for jsp views.
     */
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix(prefix);
        resolver.setSuffix(suffix);
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
}
```

4. src/main/webapp/WEB-INF/ 'de jsp görünümleri yarat.



Proje konumuna

cd /path/to/project/location

Maven'la aşağıdaki komutu kullanarak projeyi buildle


./mvnw clean install




.jar çalıştır:


java -jar target/rxjava2-simultaneous-tasks-0.0.1-SNAPSHOT.jar


localhost:8080 default lokasyon