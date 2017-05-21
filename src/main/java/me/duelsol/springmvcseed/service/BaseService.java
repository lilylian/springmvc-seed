package me.duelsol.springmvcseed.service;

import me.duelsol.springmvcseed.dao.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: 冯奕骅
 * Date: 14/10/31
 * Time: 11:35
 */
public class BaseService {

    @Autowired
    protected DaoFactory daoFactory;

    @Resource(name = "taskExecutor")
    protected TaskExecutor taskExecutor;

    @Resource(name = "redisTemplate")
    protected RedisTemplate<String, Serializable> redisTemplate;

    @Resource(name = "stringRedisTemplate")
    protected StringRedisTemplate stringRedisTemplate;

}
