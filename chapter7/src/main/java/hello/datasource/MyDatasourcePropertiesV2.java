package hello.datasource;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
@ConfigurationProperties("my.datasource")
public class MyDatasourcePropertiesV2 {

    private String url;
    private String username;
    private String password;
    private Etc etc;

    public MyDatasourcePropertiesV2(String url, String username, String password, @DefaultValue Etc etc) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.etc = etc;
    }

    @Getter
    public static class Etc {
        private int maxConnections;
        private Duration timeout;
        private List<String> options;

        public Etc(int maxConnections, Duration timeout, @DefaultValue("default") List<String> options) {
            this.maxConnections = maxConnections;
            this.timeout = timeout;
            this.options = options;
        }
    }
}
