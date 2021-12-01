package com.mars.job.task;

import com.mars.common.core.utils.OkHttpClientUtil;
import okhttp3.Response;
import org.springframework.stereotype.Component;

@Component("europeGetMsg")
public class EuropeGetMsg {

    public void getGameInfo(String params)throws Exception{
        String url = "https://search.nintendo-europe.com/en/select?rows=1&start=0&wt=json&fq=((playable_on_txt:\"HAC\"))&q=MONSTER HUNTER RISE";
        Response response = OkHttpClientUtil.getInstance().getData(url);
        System.out.println(response.body().string());
    }
}
