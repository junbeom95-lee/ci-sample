package nbc.docker.sampleapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

@Slf4j
@Configuration
public class RedisConfig {

    @Bean
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        log.info("RedisConfig : : redisConnectionFactory : ping : {} ", redisConnectionFactory.getConnection().ping());
        return new StringRedisTemplate(redisConnectionFactory);
    }
}
