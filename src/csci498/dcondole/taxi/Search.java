package csci498.dcondole.taxi;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends Activity {
	private WebView browser;
	private static final String searchURL = "http://www.google.com/search?q=taxi";
	private String noInternetMessage = "The Internet is not currently available please try again later but don't go driving";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taxi);

		checkAndSearch();
	}

	//Checks if an Internet connection is available
	public void checkAndSearch() {
		ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);

		if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED || 
				connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
			//we are connected to a network
			browser = (WebView)findViewById(R.id.webkit);	
			browser.loadUrl(searchURL);
		}
		else {
			Toast.makeText(this, noInternetMessage, Toast.LENGTH_LONG).show();
		}
	}

}