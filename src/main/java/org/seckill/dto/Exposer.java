package org.seckill.dto;

/**
 * 暴露秒杀地址DTO
 * DTO：数据传输层，关注的是web和service层间的数据传递，
 * 和entity都存放一些表示数据的类，但entity/domain：封装的是业务
 */
public class Exposer {
    private boolean exposed;

    //一种加密措施
    private String md5;

    private long seckillId;

    //系统当前时间（毫秒)
    private long now;

    private long start;

    private long end;
}
