package com.mars.game.controller;

import com.mars.common.core.domain.R;
import com.mars.game.domain.GameMaster;
import com.mars.game.service.IGameMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public void hello() {
        System.out.println("hello");
    }

    /**
     * 获取所有游戏
     */
    @Autowired
    private IGameMasterService gameMasterService;

    @RequestMapping("/game")
    public R<?>  list() {
        List<GameMaster> list = gameMasterService.selectGameAll();
        return  R.ok(list);
    }
}
