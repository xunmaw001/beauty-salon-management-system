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


import com.dao.DiscussmeirongchanpinDao;
import com.entity.DiscussmeirongchanpinEntity;
import com.service.DiscussmeirongchanpinService;
import com.entity.vo.DiscussmeirongchanpinVO;
import com.entity.view.DiscussmeirongchanpinView;

@Service("discussmeirongchanpinService")
public class DiscussmeirongchanpinServiceImpl extends ServiceImpl<DiscussmeirongchanpinDao, DiscussmeirongchanpinEntity> implements DiscussmeirongchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeirongchanpinEntity> page = this.selectPage(
                new Query<DiscussmeirongchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussmeirongchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeirongchanpinEntity> wrapper) {
		  Page<DiscussmeirongchanpinView> page =new Query<DiscussmeirongchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeirongchanpinVO> selectListVO(Wrapper<DiscussmeirongchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeirongchanpinVO selectVO(Wrapper<DiscussmeirongchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeirongchanpinView> selectListView(Wrapper<DiscussmeirongchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeirongchanpinView selectView(Wrapper<DiscussmeirongchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
