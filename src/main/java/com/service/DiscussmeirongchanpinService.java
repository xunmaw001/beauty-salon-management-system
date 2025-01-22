package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeirongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeirongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeirongchanpinView;


/**
 * 美容产品评论表
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface DiscussmeirongchanpinService extends IService<DiscussmeirongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeirongchanpinVO> selectListVO(Wrapper<DiscussmeirongchanpinEntity> wrapper);
   	
   	DiscussmeirongchanpinVO selectVO(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
   	
   	List<DiscussmeirongchanpinView> selectListView(Wrapper<DiscussmeirongchanpinEntity> wrapper);
   	
   	DiscussmeirongchanpinView selectView(@Param("ew") Wrapper<DiscussmeirongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeirongchanpinEntity> wrapper);
   	

}

