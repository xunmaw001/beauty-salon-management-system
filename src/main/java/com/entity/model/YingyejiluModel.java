package com.entity.model;

import com.entity.YingyejiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 营业记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public class YingyejiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 件数
	 */
	
	private Integer jianshu;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
		
	/**
	 * 消费时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaofeishijian;
				
	
	/**
	 * 设置：件数
	 */
	 
	public void setJianshu(Integer jianshu) {
		this.jianshu = jianshu;
	}
	
	/**
	 * 获取：件数
	 */
	public Integer getJianshu() {
		return jianshu;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：消费时间
	 */
	 
	public void setXiaofeishijian(Date xiaofeishijian) {
		this.xiaofeishijian = xiaofeishijian;
	}
	
	/**
	 * 获取：消费时间
	 */
	public Date getXiaofeishijian() {
		return xiaofeishijian;
	}
			
}
