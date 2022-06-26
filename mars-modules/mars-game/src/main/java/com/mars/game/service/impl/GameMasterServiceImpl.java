package com.mars.game.service.impl;

import com.mars.game.domain.GameMaster;
import com.mars.game.mapper.GameMasterMapper;
import com.mars.game.service.IGameMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameMasterServiceImpl implements IGameMasterService {
    @Autowired
    private GameMasterMapper gameMasterMapper;

    /**
     * 查询所有游戏
     *
     * @return 游戏列表
     */
    @Override
    public List<GameMaster> selectGameAll() {
        return gameMasterMapper.selectGameAll();
    }

    @Override
    public int insertGame(GameMaster gameMaster) {
        return gameMasterMapper.insertGame(gameMaster);
    }

    @Override
    public GameMaster selectGameById(String id) {
        return gameMasterMapper.selectGameById(id);
    }
}
