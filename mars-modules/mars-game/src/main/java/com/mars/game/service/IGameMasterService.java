package com.mars.game.service;

import com.mars.game.domain.GameMaster;

import java.util.List;


public interface IGameMasterService {
    /**
     * 查询所有游戏
     *
     * @return 游戏列表
     */
    List<GameMaster> selectGameAll();
    /**
     * 新增游戏信息
     *
     * @param gameMaster 游戏信息
     * @return 结果
     */
    int insertGame(GameMaster gameMaster);
}
