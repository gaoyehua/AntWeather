package css.com.coolweather.util;

/**
 * Created by Administrator on 2016/5/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
