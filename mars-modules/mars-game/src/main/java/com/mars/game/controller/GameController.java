package com.mars.game.controller;


import com.mars.common.core.domain.R;
import com.mars.common.core.web.controller.BaseController;
import com.mars.common.core.web.domain.AjaxResult;
import com.mars.common.log.annotation.Log;
import com.mars.common.log.enums.BusinessType;
import com.mars.game.domain.GameMaster;
import com.mars.game.service.IGameMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController extends BaseController {
    /**
     * 获取所有游戏
     */
    @Autowired
    private IGameMasterService gameMasterService;

    @RequestMapping("/list")
    public R<?> list() {
        List<GameMaster> list = gameMasterService.selectGameAll();
        return R.ok(list);
    }

    /**
     * 新增游戏信息
     */
    @Log(title = "游戏管理", businessType = BusinessType.INSERT)
    @RequestMapping("/add")
    public AjaxResult add(@Validated @RequestBody GameMaster gameMaster) {
        return toAjax(gameMasterService.insertGame(gameMaster));
    }
    /**
     * 根据id获取详细信息
     */
    @RequestMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable String id) {
        return AjaxResult.success(gameMasterService.selectGameById(id));
    }
}

