package com.example.archiecture.config.info;


import lombok.Value;


//mysql的配置文件管理在spring的容器中，从而在程序中优雅的使用。
@Component
@PropertySource("classpath:mysql.properties")  //当前这个类JdbcInfo所对应的配置文件
public class JdbcInfo {

    @Value("")
    private String url;

    @Value("${DRIVER")  //拿value去映射
    private String driver;

    @Value("zlx")
    private String username;

    @Value("")
    private String password;

    @Value("stat,config")
    private String filters;

    @Value("config.decrypt=true;config.decrypt.key=${mariaDB.publicKey}")
    private String connectionProperties;


    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFilters() {
        return filters;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

}
