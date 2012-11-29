package csci498.dcondole.taxi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Taxi t = new Taxi();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button taxiButton = (Button)findViewById(R.id.taxiButton);
        
        taxiButton.setOnClickListener(onSearch);
    }	
    
    public View.OnClickListener onSearch = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(MainActivity.this, Search.class);
			
			MainActivity.this.startActivity(i);
			
		}
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
