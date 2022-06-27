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
    /**
     * 通过ID查询游戏信息
     *
     * @param id 游戏ID
     * @return 游戏对象的信息
     */
    GameMaster selectGameById(String id);
    /**
     * 删除岗位信息
     *
     * @param id 游戏ID
     * @return 结果
     */
    int deleteGameById(String id);
    /**
     * 批量删除岗位信息
     *
     * @param ids 需要删除的游戏ID
     * @return 结果
     */
    int deleteGameByIds(String[] ids);
    /**
     * 修改游戏信息
     *
     * @param gameMaster 游戏信息
     * @return 结果
     */
    int updateGame(GameMaster gameMaster);
}
