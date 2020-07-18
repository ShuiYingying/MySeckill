package org.seckill.service;

import org.seckill.domain.Seckill;

import java.util.List;

public interface SeckillService {
    /**
     * 查询所有的秒杀记录
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);

    /**
     * 输出秒杀接口的地址
     * 否则输出系统时间和秒杀时间
     * 即秒杀的地址应当是秒杀时才开启的，而非可以推测的固定地址
     * @param seckillId
     */
    void exportSeckillUrl(long seckillId);
}
