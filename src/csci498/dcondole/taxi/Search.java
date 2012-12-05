package csci498.dcondole.taxi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Search extends Activity {
	private WebView browser;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taxi);
        
        browser = (WebView)findViewById(R.id.webkit);
        browser.loadUrl("http://www.google.com/search?q=taxi");
    }

}