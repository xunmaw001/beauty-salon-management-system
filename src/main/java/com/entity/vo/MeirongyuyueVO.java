package com.entity.vo;

import com.entity.MeirongyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 美容预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public class MeirongyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
