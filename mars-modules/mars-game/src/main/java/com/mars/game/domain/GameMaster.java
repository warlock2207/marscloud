package com.mars.game.domain;

import com.mars.common.core.annotation.Excel;

import java.io.Serializable;

/**
 * 游戏清单 game_master
 *
 */

public class GameMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 游戏序号
     */
    @Excel(name = "游戏序号", cellType = Excel.ColumnType.NUMERIC)
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

    @Override
    public String toString() {
        return "GameMaster{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", gameId='" + gameId + '\'' +
                ", nsuid='" + nsuid + '\'' +
                '}';
    }
}
