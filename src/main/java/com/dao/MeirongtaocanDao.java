package com.dao;

import com.entity.MeirongtaocanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeirongtaocanVO;
import com.entity.view.MeirongtaocanView;


/**
 * 美容套餐
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface MeirongtaocanDao extends BaseMapper<MeirongtaocanEntity> {
	
	List<MeirongtaocanVO> selectListVO(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
	
	MeirongtaocanVO selectVO(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
	
	List<MeirongtaocanView> selectListView(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);

	List<MeirongtaocanView> selectListView(Pagination page,@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
	
	MeirongtaocanView selectView(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
	

}
