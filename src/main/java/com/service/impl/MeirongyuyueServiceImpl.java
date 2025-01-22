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


import com.dao.MeirongyuyueDao;
import com.entity.MeirongyuyueEntity;
import com.service.MeirongyuyueService;
import com.entity.vo.MeirongyuyueVO;
import com.entity.view.MeirongyuyueView;

@Service("meirongyuyueService")
public class MeirongyuyueServiceImpl extends ServiceImpl<MeirongyuyueDao, MeirongyuyueEntity> implements MeirongyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongyuyueEntity> page = this.selectPage(
                new Query<MeirongyuyueEntity>(params).getPage(),
                new EntityWrapper<MeirongyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongyuyueEntity> wrapper) {
		  Page<MeirongyuyueView> page =new Query<MeirongyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongyuyueVO> selectListVO(Wrapper<MeirongyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongyuyueVO selectVO(Wrapper<MeirongyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongyuyueView> selectListView(Wrapper<MeirongyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongyuyueView selectView(Wrapper<MeirongyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
