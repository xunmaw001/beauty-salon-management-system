package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeirongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeirongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeirongchanpinView;


/**
 * 美容产品
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface MeirongchanpinService extends IService<MeirongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeirongchanpinVO> selectListVO(Wrapper<MeirongchanpinEntity> wrapper);
   	
   	MeirongchanpinVO selectVO(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
   	
   	List<MeirongchanpinView> selectListView(Wrapper<MeirongchanpinEntity> wrapper);
   	
   	MeirongchanpinView selectView(@Param("ew") Wrapper<MeirongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeirongchanpinEntity> wrapper);
   	

}

