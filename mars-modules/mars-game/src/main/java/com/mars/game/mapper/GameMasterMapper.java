package com.mars.game.mapper;

import com.mars.game.domain.GameMaster;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameMasterMapper {
    /**
     * 查询游戏数据集合
     * @return 游戏数据集合
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
}
