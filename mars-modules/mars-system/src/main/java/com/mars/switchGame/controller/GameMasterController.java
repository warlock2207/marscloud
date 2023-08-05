package com.mars.switchGame.controller;

import com.mars.common.core.utils.poi.ExcelUtil;
import com.mars.common.core.web.controller.BaseController;

import com.mars.common.core.web.domain.AjaxResult;
import com.mars.common.core.web.page.TableDataInfo;
import com.mars.common.log.annotation.Log;
import com.mars.common.log.enums.BusinessType;
import com.mars.switchGame.domain.GameMaster;
import com.mars.switchGame.domain.vo.GameModel;
import com.mars.switchGame.service.IGameMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 【switchGame】Controller
 *
 * @author ruoyi
 * @date 2023-08-05
 */
@RestController
@RequestMapping("/game")
public class GameMasterController extends BaseController {
    @Autowired
    private IGameMasterService gameMasterService;

    /**
     * 查询【switchGame】列表
     */
    @GetMapping("/list")
    public TableDataInfo list(GameMaster gameMaster) {
        startPage();
        List<GameMaster> list = gameMasterService.selectGameMasterList(gameMaster);
        return getDataTable(list);
    }

    /**
     * 导出【switchGame】列表
     */

    @Log(title = "【switchGame】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GameMaster gameMaster) throws IOException {
        List<GameMaster> list = gameMasterService.selectGameMasterList(gameMaster);
        ExcelUtil<GameMaster> util = new ExcelUtil<GameMaster>(GameMaster.class);
        util.exportExcel(response, list, "【switchGame】数据");
    }

    /**
     * 获取【switchGame】详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return AjaxResult.success(gameMasterService.selectGameMasterById(id));
    }

    /**
     * 新增【switchGame】
     */

    @Log(title = "【switchGame】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GameMaster gameMaster) {
        return toAjax(gameMasterService.insertGameMaster(gameMaster));
    }

    /**
     * 修改【switchGame】
     */

    @Log(title = "【switchGame】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GameMaster gameMaster) {
        return toAjax(gameMasterService.updateGameMaster(gameMaster));
    }

    /**
     * 删除【switchGame】
     */

    @Log(title = "【switchGame】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids) {
        return toAjax(gameMasterService.deleteGameMasterByIds(ids));
    }


    @GetMapping("/gamelist")
    public TableDataInfo gamelist(GameModel gameModel) {
        startPage();
        List<GameMaster> list = gameMasterService.selectGamModelList(gameModel);
        return getDataTable(list);
    }
}
