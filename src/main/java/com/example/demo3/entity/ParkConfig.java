package com.example.demo3.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhang
 * @since 2020-06-09
 */
@TableName("Park_Config")
public class ParkConfig implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String id;

    /**
     * 应用名称
     */
    @TableField("AppName")
    private String AppName;

    /**
     * 应用密钥
     */
    @TableField("AppKey")
    private String AppKey;

    /**
     * 无感停车场密钥
     */
    @TableField("ParkKey")
    private String ParkKey;

    /**
     * 无感停车场名称
     */
    @TableField("ParkName")
    private String ParkName;

    /**
     * 无感停车场编号
     */
    @TableField("ParkNo")
    private String ParkNo;

    /**
     * 无感支付id
     */
    @TableField("ParkBusscd")
    private String ParkBusscd;

    /**
     * 支付密钥
     */
    @TableField("PayKey")
    private String PayKey;

    /**
     * 支付商户号
     */
    @TableField("PayMacId")
    private String PayMacId;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    /**
     * 是否开启第三方支付威富通、建行
     */
    @TableField("IsOpen")
    private Integer IsOpen;

    @TableField("PlatForm")
    private Integer PlatForm;

    /**
     * 是否开启无感
     */
    @TableField("IsOpenUpark")
    private Integer IsOpenUpark;

    /**
     * 超时时间
     */
    @TableField("TimeOut")
    private Integer TimeOut;

    /**
     * 公众号密钥
     */
    @TableField("AppSecret")
    private String AppSecret;

    /**
     * 公众号ID
     */
    @TableField("AppID")
    private String AppID;

    /**
     * MD5Key
     */
    @TableField("Md5Key")
    private String Md5Key;

    @TableField("WeChatBannerUrl")
    private String WeChatBannerUrl;

    /**
     * 是否固定码
     */
    @TableField("IsFixedCode")
    private Integer IsFixedCode;

    /**
     * 是否开通电子发票
     */
    @TableField("IsTicket")
    private Integer IsTicket;

    /**
     * 发票税号
     */
    @TableField("DutyNo")
    private String DutyNo;

    /**
     * 建行柜台号
     */
    @TableField("TxtCode")
    private String TxtCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    public String getParkKey() {
        return ParkKey;
    }

    public void setParkKey(String ParkKey) {
        this.ParkKey = ParkKey;
    }

    public String getParkName() {
        return ParkName;
    }

    public void setParkName(String ParkName) {
        this.ParkName = ParkName;
    }

    public String getParkNo() {
        return ParkNo;
    }

    public void setParkNo(String ParkNo) {
        this.ParkNo = ParkNo;
    }

    public String getParkBusscd() {
        return ParkBusscd;
    }

    public void setParkBusscd(String ParkBusscd) {
        this.ParkBusscd = ParkBusscd;
    }

    public String getPayKey() {
        return PayKey;
    }

    public void setPayKey(String PayKey) {
        this.PayKey = PayKey;
    }

    public String getPayMacId() {
        return PayMacId;
    }

    public void setPayMacId(String PayMacId) {
        this.PayMacId = PayMacId;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Integer getIsOpen() {
        return IsOpen;
    }

    public void setIsOpen(Integer IsOpen) {
        this.IsOpen = IsOpen;
    }

    public Integer getPlatForm() {
        return PlatForm;
    }

    public void setPlatForm(Integer PlatForm) {
        this.PlatForm = PlatForm;
    }

    public Integer getIsOpenUpark() {
        return IsOpenUpark;
    }

    public void setIsOpenUpark(Integer IsOpenUpark) {
        this.IsOpenUpark = IsOpenUpark;
    }

    public Integer getTimeOut() {
        return TimeOut;
    }

    public void setTimeOut(Integer TimeOut) {
        this.TimeOut = TimeOut;
    }

    public String getAppSecret() {
        return AppSecret;
    }

    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    public String getMd5Key() {
        return Md5Key;
    }

    public void setMd5Key(String Md5Key) {
        this.Md5Key = Md5Key;
    }

    public String getWeChatBannerUrl() {
        return WeChatBannerUrl;
    }

    public void setWeChatBannerUrl(String WeChatBannerUrl) {
        this.WeChatBannerUrl = WeChatBannerUrl;
    }

    public Integer getIsFixedCode() {
        return IsFixedCode;
    }

    public void setIsFixedCode(Integer IsFixedCode) {
        this.IsFixedCode = IsFixedCode;
    }

    public Integer getIsTicket() {
        return IsTicket;
    }

    public void setIsTicket(Integer IsTicket) {
        this.IsTicket = IsTicket;
    }

    public String getDutyNo() {
        return DutyNo;
    }

    public void setDutyNo(String DutyNo) {
        this.DutyNo = DutyNo;
    }

    public String getTxtCode() {
        return TxtCode;
    }

    public void setTxtCode(String TxtCode) {
        this.TxtCode = TxtCode;
    }

    @Override
    public String toString() {
        return "ParkConfig{" +
        "id=" + id +
        ", AppName=" + AppName +
        ", AppKey=" + AppKey +
        ", ParkKey=" + ParkKey +
        ", ParkName=" + ParkName +
        ", ParkNo=" + ParkNo +
        ", ParkBusscd=" + ParkBusscd +
        ", PayKey=" + PayKey +
        ", PayMacId=" + PayMacId +
        ", CreateTime=" + CreateTime +
        ", IsOpen=" + IsOpen +
        ", PlatForm=" + PlatForm +
        ", IsOpenUpark=" + IsOpenUpark +
        ", TimeOut=" + TimeOut +
        ", AppSecret=" + AppSecret +
        ", AppID=" + AppID +
        ", Md5Key=" + Md5Key +
        ", WeChatBannerUrl=" + WeChatBannerUrl +
        ", IsFixedCode=" + IsFixedCode +
        ", IsTicket=" + IsTicket +
        ", DutyNo=" + DutyNo +
        ", TxtCode=" + TxtCode +
        "}";
    }
}
