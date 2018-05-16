package com.greekw.dubbo.app;

import com.greekw.dubbo.api.ComputeFacade;

/**
 * @Author:wuwc
 * @Description:
 * @Date:2018/5/16 18:35
 */
public class ComputeFacadeImpl implements ComputeFacade {

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
