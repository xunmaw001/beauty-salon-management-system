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


import com.dao.DiscussmeirongtaocanDao;
import com.entity.DiscussmeirongtaocanEntity;
import com.service.DiscussmeirongtaocanService;
import com.entity.vo.DiscussmeirongtaocanVO;
import com.entity.view.DiscussmeirongtaocanView;

@Service("discussmeirongtaocanService")
public class DiscussmeirongtaocanServiceImpl extends ServiceImpl<DiscussmeirongtaocanDao, DiscussmeirongtaocanEntity> implements DiscussmeirongtaocanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeirongtaocanEntity> page = this.selectPage(
                new Query<DiscussmeirongtaocanEntity>(params).getPage(),
                new EntityWrapper<DiscussmeirongtaocanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeirongtaocanEntity> wrapper) {
		  Page<DiscussmeirongtaocanView> page =new Query<DiscussmeirongtaocanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeirongtaocanVO> selectListVO(Wrapper<DiscussmeirongtaocanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeirongtaocanVO selectVO(Wrapper<DiscussmeirongtaocanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeirongtaocanView> selectListView(Wrapper<DiscussmeirongtaocanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeirongtaocanView selectView(Wrapper<DiscussmeirongtaocanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
