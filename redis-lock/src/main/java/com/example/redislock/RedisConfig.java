package com.example.redislock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

/**
 * @author fandong
 * @create 2018/10/24
 */
@Configuration
public class RedisConfig {

    @Autowired
    private JedisPoolConfigProperties jedisPoolConfigProperties;

    @Bean
    public JedisPool getJedisPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(jedisPoolConfigProperties.getMaxIdle());
        jedisPoolConfig.setMaxTotal(jedisPoolConfigProperties.getMaxTotal());
        jedisPoolConfig.setMaxWaitMillis(jedisPoolConfigProperties.getMaxWaitMillis());
        return new JedisPool(jedisPoolConfig, jedisPoolConfigProperties.getHost(), jedisPoolConfigProperties.getPort(), Protocol.DEFAULT_TIMEOUT);
    }
}
