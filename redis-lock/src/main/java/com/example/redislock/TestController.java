package com.example.redislock;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author fandong
 * @create 2018/10/24
 */
@RestController
public class TestController {

    @Autowired
    private JedisPool jedisPool;

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @GetMapping("/try_get_lock")
    public Object tryGetLock(@RequestParam("lock_key") String lockKey,
                             @RequestParam("request_id") String requestId,
                             @RequestParam("expire_time") Integer expireTime){
        boolean res = false;
        try (Jedis jedis = jedisPool.getResource()) {
            res = RedisLockTool.tryGetDistributedLock(jedis, lockKey, requestId, expireTime);
            Thread.sleep(2000);
        } catch (Exception e) {
            logger.error(ExceptionUtils.getFullStackTrace(e));
        }
        return res;
    }

    @GetMapping("/try_release_lock")
    public Object tryReleaseLock(@RequestParam("lock_key") String lockKey,
                             @RequestParam("request_id") String requestId){
        boolean res = false;
        try (Jedis jedis = jedisPool.getResource()) {
            res = RedisLockTool.releaseDistributedLock(jedis, lockKey, requestId);
            Thread.sleep(2000);
        } catch (Exception e) {
            logger.error(ExceptionUtils.getFullStackTrace(e));
        }
        return res;
    }

    @GetMapping("/test_limit")
    @RedisLimiter(keyPrefix = "testLimit", limit = "10")
    public Object testLimit(){
        boolean res = false;
//        try(Jedis jedis = jedisPool.getResource()){
//            res = RedisLimitTool.limit(jedis, "testLimit", "10");
//        } catch (Exception e) {
//            logger.error(ExceptionUtils.getFullStackTrace(e));
//        }
        return res;
    }
}
