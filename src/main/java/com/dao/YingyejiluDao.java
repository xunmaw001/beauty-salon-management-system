package com.dao;

import com.entity.YingyejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingyejiluVO;
import com.entity.view.YingyejiluView;


/**
 * 营业记录
 * 
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public interface YingyejiluDao extends BaseMapper<YingyejiluEntity> {
	
	List<YingyejiluVO> selectListVO(@Param("ew") Wrapper<YingyejiluEntity> wrapper);
	
	YingyejiluVO selectVO(@Param("ew") Wrapper<YingyejiluEntity> wrapper);
	
	List<YingyejiluView> selectListView(@Param("ew") Wrapper<YingyejiluEntity> wrapper);

	List<YingyejiluView> selectListView(Pagination page,@Param("ew") Wrapper<YingyejiluEntity> wrapper);
	
	YingyejiluView selectView(@Param("ew") Wrapper<YingyejiluEntity> wrapper);
	

}
