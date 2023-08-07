package com.mars.switchGame.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mars.switchGame.domain.GameMaster;
import com.mars.switchGame.domain.vo.GameModel;
import com.mars.switchGame.mapper.GameMasterMapper;
import com.mars.switchGame.service.IGameMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【switchGame】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-08-05
 */
@Service
public class GameMasterServiceImpl implements IGameMasterService {
    @Autowired
    private GameMasterMapper gameMasterMapper;

    /**
     * 查询【switchGame】
     *
     * @param id 【switchGame】主键
     * @return 【switchGame】
     */
    @Override
    public GameMaster selectGameMasterById(String id) {
        return gameMasterMapper.selectGameMasterById(id);
    }

    /**
     * 查询【switchGame】列表
     *
     * @param gameMaster 【switchGame】
     * @return 【switchGame】
     */
    @Override
    public List<GameMaster> selectGameMasterList(GameMaster gameMaster) {
        return gameMasterMapper.selectGameMasterList(gameMaster);
    }

    /**
     * 新增【switchGame】
     *
     * @param gameMaster 【switchGame】
     * @return 结果
     */
    @Override
    public int insertGameMaster(GameMaster gameMaster) {
        return gameMasterMapper.insertGameMaster(gameMaster);
    }

    /**
     * 修改【switchGame】
     *
     * @param gameMaster 【switchGame】
     * @return 结果
     */
    @Override
    public int updateGameMaster(GameMaster gameMaster) {
        return gameMasterMapper.updateGameMaster(gameMaster);
    }

    /**
     * 批量删除【switchGame】
     *
     * @param ids 需要删除的【switchGame】主键
     * @return 结果
     */
    @Override
    public int deleteGameMasterByIds(String[] ids) {
        return gameMasterMapper.deleteGameMasterByIds(ids);
    }

    /**
     * 删除【switchGame】信息
     *
     * @param id 【switchGame】主键
     * @return 结果
     */
    @Override
    public int deleteGameMasterById(String id) {
        return gameMasterMapper.deleteGameMasterById(id);
    }

    @Override
    @DS("slave")
    public List<GameMaster> selectGamModelList(GameModel gameModel) {
        return gameMasterMapper.selectGameModelList(gameModel);
    }
}
