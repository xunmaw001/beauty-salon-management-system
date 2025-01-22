package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeirongtaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeirongtaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeirongtaocanView;


/**
 * 美容套餐评论表
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface DiscussmeirongtaocanService extends IService<DiscussmeirongtaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeirongtaocanVO> selectListVO(Wrapper<DiscussmeirongtaocanEntity> wrapper);
   	
   	DiscussmeirongtaocanVO selectVO(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
   	
   	List<DiscussmeirongtaocanView> selectListView(Wrapper<DiscussmeirongtaocanEntity> wrapper);
   	
   	DiscussmeirongtaocanView selectView(@Param("ew") Wrapper<DiscussmeirongtaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeirongtaocanEntity> wrapper);
   	

}

