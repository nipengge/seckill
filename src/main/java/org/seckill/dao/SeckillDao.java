package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;

/**
 *
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1,表示更新的记录行数
     */
    int reduceNumber(long seckillId,Date killTime);

    /**
     * 根据id查询秒杀实体对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);


}
