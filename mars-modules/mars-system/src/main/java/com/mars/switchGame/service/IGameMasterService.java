package com.mars.switchGame.service;

import com.mars.switchGame.domain.GameMaster;
import com.mars.switchGame.domain.vo.GameModel;

import java.util.List;

/**
 * 【switchGame】Service接口
 *
 * @author ruoyi
 * @date 2023-08-05
 */
public interface IGameMasterService {
    /**
     * 查询【switchGame】
     *
     * @param id 【switchGame】主键
     * @return 【switchGame】
     */
    public GameMaster selectGameMasterById(String id);

    /**
     * 查询【switchGame】列表
     *
     * @param gameMaster 【switchGame】
     * @return 【switchGame】集合
     */
    public List<GameMaster> selectGameMasterList(GameMaster gameMaster);

    /**
     * 新增【switchGame】
     *
     * @param gameMaster 【switchGame】
     * @return 结果
     */
    public int insertGameMaster(GameMaster gameMaster);

    /**
     * 修改【switchGame】
     *
     * @param gameMaster 【switchGame】
     * @return 结果
     */
    public int updateGameMaster(GameMaster gameMaster);

    /**
     * 批量删除【switchGame】
     *
     * @param ids 需要删除的【switchGame】主键集合
     * @return 结果
     */
    public int deleteGameMasterByIds(String[] ids);

    /**
     * 删除【switchGame】信息
     *
     * @param id 【switchGame】主键
     * @return 结果
     */
    public int deleteGameMasterById(String id);

    public List<GameMaster> selectGamModelList(GameModel gameModel);
}
