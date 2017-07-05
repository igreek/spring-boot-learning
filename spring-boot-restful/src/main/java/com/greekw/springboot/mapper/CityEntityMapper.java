package com.greekw.springboot.mapper;

import com.greekw.springboot.entity.CityEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by greekw on 2017/7/3.
 */
public interface CityEntityMapper {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<CityEntity> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    CityEntity findById(@Param("id") Long id);

    Long saveCity(CityEntity city);

    Long updateCity(CityEntity city);

    Long deleteCity(Long id);
}
