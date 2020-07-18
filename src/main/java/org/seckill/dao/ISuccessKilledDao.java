package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.domain.SuccessKilled;

public interface ISuccessKilledDao {
    /**
     * 插入秒杀成功信息
     * @param seckillId
     * @param userphone
     * @return 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone")  long userphone);

    /**
     * 根据Id查询SuccessKilled并携带秒杀铲平对象
     * @param seckillId
     * @return
     */
    SuccessKilled queryById(@Param("seckillId") long seckillId,@Param("userPhone")long userPhone);
}
