package com.entity.vo;

import com.entity.MeirongtaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 美容套餐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-26 17:22:33
 */
public class MeirongtaocanVO  implements Serializable {
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
	 * 套餐内容
	 */
	
	private String taocanneirong;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
		
	/**
	 * 积分
	 */
	
	private Integer jf;
		
	/**
	 * 价格
	 */
	
	private Float price;
		
	/**
	 * 会员价
	 */
	
	private Float vipprice;
				
	
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
	 * 设置：套餐内容
	 */
	 
	public void setTaocanneirong(String taocanneirong) {
		this.taocanneirong = taocanneirong;
	}
	
	/**
	 * 获取：套餐内容
	 */
	public String getTaocanneirong() {
		return taocanneirong;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJf(Integer jf) {
		this.jf = jf;
	}
	
	/**
	 * 获取：积分
	 */
	public Integer getJf() {
		return jf;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
				
	
	/**
	 * 设置：会员价
	 */
	 
	public void setVipprice(Float vipprice) {
		this.vipprice = vipprice;
	}
	
	/**
	 * 获取：会员价
	 */
	public Float getVipprice() {
		return vipprice;
	}
			
}
