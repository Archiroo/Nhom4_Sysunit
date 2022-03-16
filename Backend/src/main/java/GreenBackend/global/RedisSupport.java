package GreenBackend.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisSupport {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

}
