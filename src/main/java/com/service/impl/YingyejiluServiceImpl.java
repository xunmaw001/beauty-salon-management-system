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


import com.dao.YingyejiluDao;
import com.entity.YingyejiluEntity;
import com.service.YingyejiluService;
import com.entity.vo.YingyejiluVO;
import com.entity.view.YingyejiluView;

@Service("yingyejiluService")
public class YingyejiluServiceImpl extends ServiceImpl<YingyejiluDao, YingyejiluEntity> implements YingyejiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingyejiluEntity> page = this.selectPage(
                new Query<YingyejiluEntity>(params).getPage(),
                new EntityWrapper<YingyejiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingyejiluEntity> wrapper) {
		  Page<YingyejiluView> page =new Query<YingyejiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingyejiluVO> selectListVO(Wrapper<YingyejiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingyejiluVO selectVO(Wrapper<YingyejiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingyejiluView> selectListView(Wrapper<YingyejiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingyejiluView selectView(Wrapper<YingyejiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
