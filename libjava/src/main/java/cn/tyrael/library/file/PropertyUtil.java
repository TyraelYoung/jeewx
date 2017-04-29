package cn.tyrael.library.file;

import cn.tyrael.library.log.LogAdapter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/4/29.
 */
public class PropertyUtil {
    private static final String TAG = "PropertyUtil";

    public static Properties read(String path){
        Properties properties = new Properties();
        try
        {
            InputStream inputStream = new FileInputStream(path);
            properties.load(inputStream);
            inputStream.close(); //关闭流
        }
        catch (IOException e)
        {
            LogAdapter.e(TAG, e);
        }
        return properties;
    }
}
