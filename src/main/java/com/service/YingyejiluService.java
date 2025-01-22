package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingyejiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingyejiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingyejiluView;


/**
 * 营业记录
 *
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface YingyejiluService extends IService<YingyejiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingyejiluVO> selectListVO(Wrapper<YingyejiluEntity> wrapper);
   	
   	YingyejiluVO selectVO(@Param("ew") Wrapper<YingyejiluEntity> wrapper);
   	
   	List<YingyejiluView> selectListView(Wrapper<YingyejiluEntity> wrapper);
   	
   	YingyejiluView selectView(@Param("ew") Wrapper<YingyejiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingyejiluEntity> wrapper);
   	

}

