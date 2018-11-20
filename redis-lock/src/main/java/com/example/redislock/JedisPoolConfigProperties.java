package com.example.redislock;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author fandong
 * @create 2018/10/24
 */
@Configuration
@Data
public class JedisPoolConfigProperties {

    @Value("${jedis.pool.host}")
    private String host;
    @Value("${jedis.pool.port}")
    private Integer port;
    @Value("${jedis.pool.config.maxTotal}")
    private Integer maxTotal;
    @Value("${jedis.pool.config.maxIdle}")
    private Integer maxIdle;
    @Value("${jedis.pool.config.maxWaitMillis}")
    private Long maxWaitMillis;
    @Value("${jedis.pool.config.password}")
    private String password;

    public JedisPoolConfigProperties() {
    }
}
