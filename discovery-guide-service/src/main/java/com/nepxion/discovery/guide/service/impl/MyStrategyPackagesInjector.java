package com.nepxion.discovery.guide.service.impl;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.Arrays;
import java.util.List;

import com.nepxion.discovery.common.entity.PackagesInjectorEntity;
import com.nepxion.discovery.common.entity.PackagesInjectorType;
import com.nepxion.discovery.plugin.strategy.injector.StrategyPackagesInjector;

public class MyStrategyPackagesInjector implements StrategyPackagesInjector {
    @Override
    public List<PackagesInjectorEntity> getPackagesInjectorEntityList() {
        return Arrays.asList(
                new PackagesInjectorEntity(PackagesInjectorType.TRACER, Arrays.asList("com.nepxion.discovery.guide.test.test1")),
                new PackagesInjectorEntity(PackagesInjectorType.ALL, Arrays.asList("com.nepxion.discovery.guide.test.test2"))
        );
    }
}