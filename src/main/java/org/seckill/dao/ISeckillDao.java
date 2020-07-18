package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.domain.Seckill;

import java.util.Date;
import java.util.List;

public interface ISeckillDao {
    /**
     * 减库存，其实就是update操作
     * @param seckillId
     * @param killTime
     * @return 影响的行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀对象
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
