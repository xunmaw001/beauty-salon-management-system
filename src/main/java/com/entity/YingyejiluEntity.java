package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 营业记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
@TableName("yingyejilu")
public class YingyejiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YingyejiluEntity() {
		
	}
	
	public YingyejiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
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
