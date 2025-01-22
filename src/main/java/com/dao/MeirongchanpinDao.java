package com.dao;

import com.entity.MeirongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongchanpinVO;
import com.entity.view.MeirongchanpinView;


/**
 * 美容产品
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface MeirongchanpinDao extends BaseMapper<MeirongchanpinEntity> {
	
	List<MeirongchanpinVO> selectListVO(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
	
	MeirongchanpinVO selectVO(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
	
	List<MeirongchanpinView> selectListView(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);

	List<MeirongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
	
	MeirongchanpinView selectView(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
	

}
