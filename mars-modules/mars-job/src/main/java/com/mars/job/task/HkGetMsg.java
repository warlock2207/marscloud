package com.mars.job.task;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mars.common.core.utils.OkHttpClientUtil;
import com.mars.job.service.ISysJobLogService;
import okhttp3.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component("hkGetMsg")
public class HkGetMsg {

    public void getGameInfo(String params) throws Exception {
        String url = "https://www.nintendo.com.hk/data/json/switch_software.json";
        Response response = OkHttpClientUtil.getInstance().getData(url);
        String data=response.body().string();
       /* System.out.println(data);
        JSONObject jsonObject=JSONObject.parseObject(data);
        JSONObject res=JSONObject.parseObject(jsonObject.get("response").toString());
        JSONArray reJSon=JSONArray.parseArray(res.get("docs").toString());*/
        JSONArray reJSon=JSONArray.parseArray(data);
        for (int i = 0; i <reJSon.size() ; i++) {
            JSONObject obj=reJSon.getJSONObject(i);
            if("eshop".equals(obj.get("media").toString())){
                if("MONSTER HUNTER RISE".equals(obj.get("title").toString())){
                    //拿url；
                    System.out.println(obj.get("link"));
                    Response responseHtml = OkHttpClientUtil.getInstance().getData(obj.get("link").toString());
                    //获取html
                    String html=responseHtml.body().string();
                    Document document = Jsoup.parse(html);
                    //拿信息
                    //product-attributes release_date
                    //
                    Elements elements = document.select("div[class=product-attribute release_date]");
                    Document release_date = Jsoup.parse(elements.html());
                    String time=release_date.getElementsByClass("product-attribute-val").text();
                    System.out.println(time);
                    //获取hac 值
                    Element hac = document.getElementById("product_addtocart_form");
                    String hacStr= hac.attr("data-product-sku");
                    System.out.println(hacStr);
                    //获取简介
                    Elements descriptionS = document.select("div[class=product attribute description]");
                    StringBuilder sb=new StringBuilder();
                    for (Element e:descriptionS) {
                        sb.append(e.text());
                    }
                    System.out.println(sb.toString());


                }
            }
        }
    }

    public static void main(String[] args)throws Exception {
        HkGetMsg hkGetMsg=new HkGetMsg();
        hkGetMsg.getGameInfo("");
    }
}