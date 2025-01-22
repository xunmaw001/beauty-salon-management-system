package com.entity.view;

import com.entity.YingyejiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 营业记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
@TableName("yingyejilu")
public class YingyejiluView  extends YingyejiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingyejiluView(){
	}
 
 	public YingyejiluView(YingyejiluEntity yingyejiluEntity){
 	try {
			BeanUtils.copyProperties(this, yingyejiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
