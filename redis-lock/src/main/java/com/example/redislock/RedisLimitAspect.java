package com.example.redislock;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author fandong
 * @create 2018/10/25
 */
@Component
@Aspect
public class RedisLimitAspect {

    @Autowired
    private JedisPool jedisPool;

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Around("execution(* com.example.redislock..*(..)) && @annotation(redisLimiter)")
    public Object redisLimiter(ProceedingJoinPoint proceedingJoinPoint, RedisLimiter redisLimiter){
        try(Jedis jedis = jedisPool.getResource()) {
            if (RedisLimitTool.limit(jedis, redisLimiter.keyPrefix(), redisLimiter.limit())){
                return proceedingJoinPoint.proceed();
            }else {
                logger.error("限流：" + redisLimiter.keyPrefix());
                return null;
            }
        } catch (Throwable throwable) {
            logger.error(ExceptionUtils.getFullStackTrace(throwable));
        }
        return null;
    }
}
