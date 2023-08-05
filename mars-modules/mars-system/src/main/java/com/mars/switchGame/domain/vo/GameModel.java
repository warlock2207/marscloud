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

}
