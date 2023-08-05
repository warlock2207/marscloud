package com.mars.switchGame.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.mars.common.core.annotation.Excel;
import com.mars.common.core.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * 【switchGame】对象 game_master
 * 
 * @author ruoyi
 * @date 2023-08-05
 */
public class GameMaster extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setText(String text) 
    {
        this.text = text;
    }

    public String getText() 
    {
        return text;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setGameId(String gameId) 
    {
        this.gameId = gameId;
    }

    public String getGameId() 
    {
        return gameId;
    }
    public void setNsuid(String nsuid) 
    {
        this.nsuid = nsuid;
    }

    public String getNsuid() 
    {
        return nsuid;
    }
    public void setPdate(Date pdate) 
    {
        this.pdate = pdate;
    }

    public Date getPdate() 
    {
        return pdate;
    }
    public void setGameType(String gameType) 
    {
        this.gameType = gameType;
    }

    public String getGameType() 
    {
        return gameType;
    }
    public void setRomSize(String romSize) 
    {
        this.romSize = romSize;
    }

    public String getRomSize() 
    {
        return romSize;
    }
    public void setPlayMode(String playMode) 
    {
        this.playMode = playMode;
    }

    public String getPlayMode() 
    {
        return playMode;
    }
    public void setIsAmiibo(String isAmiibo) 
    {
        this.isAmiibo = isAmiibo;
    }

    public String getIsAmiibo() 
    {
        return isAmiibo;
    }
    public void setImg(String img) 
    {
        this.img = img;
    }

    public String getImg() 
    {
        return img;
    }
    public void setIsDlc(String isDlc) 
    {
        this.isDlc = isDlc;
    }

    public String getIsDlc() 
    {
        return isDlc;
    }
    public void setMainId(String mainId) 
    {
        this.mainId = mainId;
    }

    public String getMainId() 
    {
        return mainId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("text", getText())
            .append("url", getUrl())
            .append("gameId", getGameId())
            .append("nsuid", getNsuid())
            .append("pdate", getPdate())
            .append("gameType", getGameType())
            .append("romSize", getRomSize())
            .append("playMode", getPlayMode())
            .append("isAmiibo", getIsAmiibo())
            .append("img", getImg())
            .append("isDlc", getIsDlc())
            .append("mainId", getMainId())
            .toString();
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
}
