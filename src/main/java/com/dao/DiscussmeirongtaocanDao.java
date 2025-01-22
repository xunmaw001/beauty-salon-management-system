package com.dao;

import com.entity.DiscussmeirongtaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeirongtaocanVO;
import com.entity.view.DiscussmeirongtaocanView;


/**
 * 美容套餐评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface DiscussmeirongtaocanDao extends BaseMapper<DiscussmeirongtaocanEntity> {
	
	List<DiscussmeirongtaocanVO> selectListVO(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
	
	DiscussmeirongtaocanVO selectVO(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
	
	List<DiscussmeirongtaocanView> selectListView(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);

	List<DiscussmeirongtaocanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
	
	DiscussmeirongtaocanView selectView(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
	

}
