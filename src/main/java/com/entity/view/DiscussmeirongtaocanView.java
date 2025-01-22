package com.entity.view;

import com.entity.DiscussmeirongtaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美容套餐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
@TableName("discussmeirongtaocan")
public class DiscussmeirongtaocanView  extends DiscussmeirongtaocanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeirongtaocanView(){
	}
 
 	public DiscussmeirongtaocanView(DiscussmeirongtaocanEntity discussmeirongtaocanEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeirongtaocanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
