package leoprok.me.leosportfolio.factories;

import android.content.Context;
import android.webkit.WebView;

import leoprok.me.leosportfolio.interfaces.FactoryInterface;

/**
 * Factory for app specifics
 */

public class FactoryBuilder {
    //set the website of webvie and enabled javascript
    public static FactoryInterface getWebView(WebView webView, Context context){
        return new WebLoader(webView,context);
    }

}
