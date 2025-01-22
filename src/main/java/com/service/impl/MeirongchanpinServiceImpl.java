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


import com.dao.MeirongchanpinDao;
import com.entity.MeirongchanpinEntity;
import com.service.MeirongchanpinService;
import com.entity.vo.MeirongchanpinVO;
import com.entity.view.MeirongchanpinView;

@Service("meirongchanpinService")
public class MeirongchanpinServiceImpl extends ServiceImpl<MeirongchanpinDao, MeirongchanpinEntity> implements MeirongchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeirongchanpinEntity> page = this.selectPage(
                new Query<MeirongchanpinEntity>(params).getPage(),
                new EntityWrapper<MeirongchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeirongchanpinEntity> wrapper) {
		  Page<MeirongchanpinView> page =new Query<MeirongchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeirongchanpinVO> selectListVO(Wrapper<MeirongchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeirongchanpinVO selectVO(Wrapper<MeirongchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeirongchanpinView> selectListView(Wrapper<MeirongchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeirongchanpinView selectView(Wrapper<MeirongchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
