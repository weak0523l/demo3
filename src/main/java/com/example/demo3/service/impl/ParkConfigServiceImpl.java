package com.example.demo3.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo3.entity.ParkConfig;
import com.example.demo3.mapper.ParkConfigMapper;
import com.example.demo3.service.ParkConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhang
 * @since 2020-06-09
 */
@Service
public class ParkConfigServiceImpl extends ServiceImpl<ParkConfigMapper, ParkConfig> implements ParkConfigService {
    @Autowired
    ParkConfigMapper parkConfigMapper;

    @Override
    public List<ParkConfig> getList() {
        return baseMapper.selectList(null);
    }


    @Override
    public List<ParkConfig> finePage(String pagenow, String pagecount) {

        Page<ParkConfig> page = new Page<>(Integer.parseInt(pagenow),Integer.parseInt(pagecount));

        IPage<ParkConfig> iPage = parkConfigMapper.selectPage(page, null);

        List<ParkConfig> records = iPage.getRecords();

        return records;
    }
}
