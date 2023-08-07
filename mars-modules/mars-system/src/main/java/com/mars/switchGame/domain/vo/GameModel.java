package com.mars.switchGame.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mars.common.core.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

public class GameModel implements Serializable {

    private static final long serialVersionUID = -6951529574588594283L;
    /** 主键 */
    private String id;

    /** 标题- 游戏说明 */
    @Excel(name = "标题- 游戏说明")
    private String title;

    /** 游戏说明文本 */
    @Excel(name = "游戏说明文本")
    private String text;

    /** 游戏地址 */
    @Excel(name = "游戏地址")
    private String url;

    /** 游戏id(任天堂Id) */
    @Excel(name = "游戏id(任天堂Id)")
    private String gameId;

    /** nsuid */
    @Excel(name = "nsuid")
    private String nsuid;

    /** 发售时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发售时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pdate;

    /** 游戏类型 冒险、动作 */
    @Excel(name = "游戏类型 冒险、动作")
    private String gameType;

    /** 游戏容量 500MB */
    @Excel(name = "游戏容量 500MB")
    private String romSize;

    /** 游戏模式 TV,TABLE,HAND */
    @Excel(name = "游戏模式 TV,TABLE,HAND")
    private String playMode;

    /** 是否支持amiibo */
    @Excel(name = "是否支持amiibo")
    private String isAmiibo;

    /** 图片url */
    @Excel(name = "图片url")
    private String img;

    /** 是否DLC */
    @Excel(name = "是否DLC")
    private String isDlc;

    /** 主体ID */
    @Excel(name = "主体ID")
    private String mainId;

    private String choiceness;

    private String isHot;

    private Integer score;

    private String country;

    private String original_price;

    private String discount_price;

    private String is_discount;

    private String original_price_cny;

    private String discount_price_cny;

    private String discount_begin;

    private String discount_end;

    private String discountMoney;

    private String type;

    private int pageNum;

    private int pageSize;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getNsuid() {
        return nsuid;
    }

    public void setNsuid(String nsuid) {
        this.nsuid = nsuid;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getRomSize() {
        return romSize;
    }

    public void setRomSize(String romSize) {
        this.romSize = romSize;
    }

    public String getPlayMode() {
        return playMode;
    }

    public void setPlayMode(String playMode) {
        this.playMode = playMode;
    }

    public String getIsAmiibo() {
        return isAmiibo;
    }

    public void setIsAmiibo(String isAmiibo) {
        this.isAmiibo = isAmiibo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIsDlc() {
        return isDlc;
    }

    public void setIsDlc(String isDlc) {
        this.isDlc = isDlc;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getChoiceness() {
        return choiceness;
    }

    public void setChoiceness(String choiceness) {
        this.choiceness = choiceness;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(String original_price) {
        this.original_price = original_price;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(String discount_price) {
        this.discount_price = discount_price;
    }

    public String getIs_discount() {
        return is_discount;
    }

    public void setIs_discount(String is_discount) {
        this.is_discount = is_discount;
    }

    public String getOriginal_price_cny() {
        return original_price_cny;
    }

    public void setOriginal_price_cny(String original_price_cny) {
        this.original_price_cny = original_price_cny;
    }

    public String getDiscount_price_cny() {
        return discount_price_cny;
    }

    public void setDiscount_price_cny(String discount_price_cny) {
        this.discount_price_cny = discount_price_cny;
    }

    public String getDiscount_begin() {
        return discount_begin;
    }

    public void setDiscount_begin(String discount_begin) {
        this.discount_begin = discount_begin;
    }

    public String getDiscount_end() {
        return discount_end;
    }

    public void setDiscount_end(String discount_end) {
        this.discount_end = discount_end;
    }

    public String getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(String discountMoney) {
        this.discountMoney = discountMoney;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
