package com.greekw.springboot.service.impl;

import com.greekw.springboot.entity.CityEntity;
import com.greekw.springboot.mapper.CityEntityMapper;
import com.greekw.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by greekw on 2017/7/3.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityEntityMapper cityEntityMapper;

    @Override
    public List<CityEntity> findAllCity() {
        return cityEntityMapper.findAllCity();
    }

    @Override
    public CityEntity findCityById(Long id) {
        return cityEntityMapper.findById(id);
    }

    @Override
    public Long saveCity(CityEntity city) {
        return cityEntityMapper.saveCity(city);
    }

    @Override
    public Long updateCity(CityEntity city) {
        return cityEntityMapper.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityEntityMapper.deleteCity(id);
    }
}
