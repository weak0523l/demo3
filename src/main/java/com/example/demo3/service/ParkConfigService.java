package com.example.demo3.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo3.entity.ParkConfig;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhang
 * @since 2020-06-09
 */
public interface ParkConfigService extends IService<ParkConfig> {
    List<ParkConfig> getList();


    List<ParkConfig> finePage(String pagenow, String pagecount);
}
