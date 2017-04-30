package wang.tyrael.wiki;

import cn.tyrael.library.http.HttpDefault;
import cn.tyrael.library.log.LogAdapter;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import okhttp3.Response;
import wang.tyrael.wiki.json.Page;
import wang.tyrael.wiki.json.SearchResult;

import java.io.IOException;


/**
 * Created by Administrator on 2017/4/29.
 */
public class WikiBiz {
    private static final String TAG = "WikiBiz";
    public static WikiUrl wikiUrl = new WikiUrl();

    public static Page serchOne(String key) {
        String url = String.format(wikiUrl.serach(), key);
        Response response = HttpDefault.get(url);
        String s = null;
        try {
            s = response.body().string();
        } catch (IOException e) {
            LogAdapter.w(TAG, "网络失败");
        }
        SearchResult searchResult = new Gson().fromJson(s, SearchResult.class);

        String first = searchResult.getFirst() + "?media=json";
        if(first == null){
            return null;
        }else {
            Response response1 = HttpDefault.get(first);
            String s1 = null;
            try {
                s1 = response1.body().string();
            } catch (IOException e) {
                LogAdapter.w(TAG, "网络失败");
            }
            //TODO 结果是不是一定是page？
            Page page = null;
            try {
                page = new Gson().fromJson(s1, Page.class);
            } catch (JsonSyntaxException jse) {
                LogAdapter.e(TAG, jse);
                LogAdapter.w(TAG, "解析失败：" + s1);
            }
            return page;
        }
    }
}
