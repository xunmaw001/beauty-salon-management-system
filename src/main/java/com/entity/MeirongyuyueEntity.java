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
 * 美容预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
@TableName("meirongyuyue")
public class MeirongyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public MeirongyuyueEntity() {
		
	}
	
	public MeirongyuyueEntity(T t) {
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
	 * 套餐编号
	 */
					
	private String taocanbianhao;
	
	/**
	 * 套餐名称
	 */
					
	private String taocanmingcheng;
	
	/**
	 * 套餐类型
	 */
					
	private String taocanleixing;
	
	/**
	 * 套餐图片
	 */
					
	private String taocantupian;
	
	/**
	 * 可约时间
	 */
					
	private String keyueshijian;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 预约备注
	 */
					
	private String yuyuebeizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 登记时间
	 */
					
	private String dengjishijian;
	
	
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
	 * 设置：套餐编号
	 */
	public void setTaocanbianhao(String taocanbianhao) {
		this.taocanbianhao = taocanbianhao;
	}
	/**
	 * 获取：套餐编号
	 */
	public String getTaocanbianhao() {
		return taocanbianhao;
	}
	/**
	 * 设置：套餐名称
	 */
	public void setTaocanmingcheng(String taocanmingcheng) {
		this.taocanmingcheng = taocanmingcheng;
	}
	/**
	 * 获取：套餐名称
	 */
	public String getTaocanmingcheng() {
		return taocanmingcheng;
	}
	/**
	 * 设置：套餐类型
	 */
	public void setTaocanleixing(String taocanleixing) {
		this.taocanleixing = taocanleixing;
	}
	/**
	 * 获取：套餐类型
	 */
	public String getTaocanleixing() {
		return taocanleixing;
	}
	/**
	 * 设置：套餐图片
	 */
	public void setTaocantupian(String taocantupian) {
		this.taocantupian = taocantupian;
	}
	/**
	 * 获取：套餐图片
	 */
	public String getTaocantupian() {
		return taocantupian;
	}
	/**
	 * 设置：可约时间
	 */
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：预约备注
	 */
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(String dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public String getDengjishijian() {
		return dengjishijian;
	}

}
