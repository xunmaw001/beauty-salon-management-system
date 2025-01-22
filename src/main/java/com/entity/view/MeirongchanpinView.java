package com.entity.view;

import com.entity.MeirongchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美容产品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
@TableName("meirongchanpin")
public class MeirongchanpinView  extends MeirongchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeirongchanpinView(){
	}
 
 	public MeirongchanpinView(MeirongchanpinEntity meirongchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, meirongchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
