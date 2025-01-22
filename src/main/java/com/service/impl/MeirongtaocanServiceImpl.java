package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MeirongtaocanDao;
import com.entity.MeirongtaocanEntity;
import com.service.MeirongtaocanService;
import com.entity.vo.MeirongtaocanVO;
import com.entity.view.MeirongtaocanView;

@Service("meirongtaocanService")
public class MeirongtaocanServiceImpl extends ServiceImpl<MeirongtaocanDao, MeirongtaocanEntity> implements MeirongtaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongtaocanEntity> page = this.selectPage(
                new Query<MeirongtaocanEntity>(params).getPage(),
                new EntityWrapper<MeirongtaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongtaocanEntity> wrapper) {
		  Page<MeirongtaocanView> page =new Query<MeirongtaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongtaocanVO> selectListVO(Wrapper<MeirongtaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongtaocanVO selectVO(Wrapper<MeirongtaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongtaocanView> selectListView(Wrapper<MeirongtaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongtaocanView selectView(Wrapper<MeirongtaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
