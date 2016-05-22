package css.com.coolweather.activity;

import android.app.Activity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.SmallTest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import css.com.coolweather.R;

/**
 * Created by 高业华 on 2016/5/22.
 */
public class search extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        webView =(WebView) findViewById(R.id.web_view);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading (WebView view,String url) {
                view.loadUrl(url); //根据传入的参数再去加载网页
                return true; //表示当前网页可以处理打开新网页的请求，不能借助系统浏览器

            }

        });

        webView.loadUrl("http://soguge.com");



    }

}
