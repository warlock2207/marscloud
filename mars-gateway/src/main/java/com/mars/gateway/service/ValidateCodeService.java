package com.mars.gateway.service;

import com.mars.common.core.exception.CaptchaException;
import com.mars.common.core.web.domain.AjaxResult;

import java.io.IOException;

public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    public AjaxResult createCapcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCapcha(String key, String value) throws CaptchaException;
}
