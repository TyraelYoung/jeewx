package wang.tyrael.wiki;

import cn.tyrael.library.file.PropertyUtil;

import java.util.Properties;

/**
 * Created by Administrator on 2017/4/29.
 */
public class WikiUrl {
    private String urlBase;

    public WikiUrl(){
        readHost();
    }

    public void readHost(){
//        String resourceRoot = "../resources/";
        //Properties p = PropertyUtil.read("wiki.properties", WikiUrl.class.getClassLoader());
//        Properties p = PropertyUtil.read("wiki.properties");
//        urlBase =  p.getProperty("wikiUrl");
        urlBase = "http://kanchuan17.tyrael.wang";
    }

    public String serach(){
        return urlBase + "/xwiki/rest/wikis/query?media=json&q=%s";
    }
}
