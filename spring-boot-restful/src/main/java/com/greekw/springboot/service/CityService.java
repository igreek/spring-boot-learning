package com.greekw.springboot.service;

import com.greekw.springboot.entity.CityEntity;

import java.util.List;

/**
 * Created by greekw on 2017/7/3.
 */
public interface CityService {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<CityEntity> findAllCity();

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    CityEntity findCityById(Long id);

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(CityEntity city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     */
    Long updateCity(CityEntity city);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
