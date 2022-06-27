package com.mars.game.domain;

import com.mars.common.core.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

/**
 * 游戏清单 game_master
 *
 */

public class GameMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 游戏序号
     */
    @Excel(name = "游戏序号", cellType = Excel.ColumnType.STRING)
    private String id;
    @Excel(name = "游戏标题")
    private String title;
    @Excel(name = "游戏说明文本")
    private String text;
    @Excel(name = "游戏地址")
    private String url;
    @Excel(name = "游戏id")
    private String gameId;
    @Excel(name = "nsuid")
    private String nsuid;
    @Excel(name = "发售时间")
    private Date pdate;
    /**
     * 游戏类型 冒险，动作等
     */
    @Excel(name = "游戏类型")
    private String gameType;
    @Excel(name = "游戏容量")
    private String romSize;
    /**
     * 游戏类型 TV,TABLE,HAND
     */
    @Excel(name = "游戏模式")
    private String playMode;
    /**
     * 游戏是否支持ammiibo 默认不存在 1=true,0=false
     */
    private boolean isAmiibo=false;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public boolean isAmiibo() {
        return isAmiibo;
    }

    public void setAmiibo(boolean amiibo) {
        isAmiibo = amiibo;
    }

    @Override
    public String toString() {
        return "GameMaster{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", gameId='" + gameId + '\'' +
                ", nsuid='" + nsuid + '\'' +
                ", pdate=" + pdate +
                ", gameType='" + gameType + '\'' +
                ", romSize='" + romSize + '\'' +
                ", playMode='" + playMode + '\'' +
                ", isAmiibo=" + isAmiibo +
                '}';
    }
}

