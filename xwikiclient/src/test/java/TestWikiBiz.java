import cn.tyrael.library.log.LogAdapter;
import wang.tyrael.wiki.WikiBiz;
import wang.tyrael.wiki.json.Page;

/**
 * Created by Administrator on 2017/4/30.
 */
public class TestWikiBiz {
    private static final String TAG = "TestWikiBiz";

    public static void main(String[] args){
        testSearchOne();
    }

    public static void testSearchOne(){
        Page page = WikiBiz.serchOne("沙");
        String contentShort = page.getContentShort();
        LogAdapter.d(TAG, "contentShort:" + contentShort);
    }
}
