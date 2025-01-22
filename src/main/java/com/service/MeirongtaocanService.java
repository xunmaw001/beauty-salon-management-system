package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongtaocanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongtaocanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongtaocanView;


/**
 * 美容套餐
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface MeirongtaocanService extends IService<MeirongtaocanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongtaocanVO> selectListVO(Wrapper<MeirongtaocanEntity> wrapper);
   	
   	MeirongtaocanVO selectVO(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
   	
   	List<MeirongtaocanView> selectListView(Wrapper<MeirongtaocanEntity> wrapper);
   	
   	MeirongtaocanView selectView(@Param("ew") Wrapper<MeirongtaocanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongtaocanEntity> wrapper);
   	

}

