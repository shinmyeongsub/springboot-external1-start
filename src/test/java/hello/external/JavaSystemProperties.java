package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {

        //        System.setProperty("hello_key", "hello_value");
        //        String property = System.getProperty("hello_key");
        //        log.info("property = {}", property);

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("props {} = {}", key, System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
