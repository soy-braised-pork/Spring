package com.example.archiecture.config;




@Configuration //定义配置类，可替换xml配置文件
@EnableCacaing
public class CacheConfig {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
    }


    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        return RedisCacheManager.creat(redisConnectionFactory);
    }
}
