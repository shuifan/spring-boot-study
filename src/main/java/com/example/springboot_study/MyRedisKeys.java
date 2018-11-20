package com.example.springboot_study;

import com.chinacaring.cache.config.RedisKeys;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MyRedisKeys extends RedisKeys {
    public static final String _CACHE_TEST = "_cache_test";
    protected static final long _CACHE_TEST_SECOND = 1000L;

    @Override
    public void init() {
        super.init();
        expiresMap.put(_CACHE_TEST, _CACHE_TEST_SECOND);
    }
}
