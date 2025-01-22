package com.dao;

import com.entity.DiscussmeirongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeirongchanpinVO;
import com.entity.view.DiscussmeirongchanpinView;


/**
 * 美容产品评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface DiscussmeirongchanpinDao extends BaseMapper<DiscussmeirongchanpinEntity> {
	
	List<DiscussmeirongchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
	
	DiscussmeirongchanpinVO selectVO(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
	
	List<DiscussmeirongchanpinView> selectListView(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);

	List<DiscussmeirongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
	
	DiscussmeirongchanpinView selectView(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
	

}
