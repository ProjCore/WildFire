package WildFire;

import com.example.wildfire.R;
import com.example.wildfire.R.id;
import com.example.wildfire.R.layout;
import com.example.wildfire.R.menu;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.os.Build;
import android.net.wifi.WifiManager;

public class WifiActivity extends Activity {

	   WifiManager mainWifiObj;
	   WifiManagerService wifiManagerService;
	   ListView list;
	   String wifis[];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wifi_manager);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
	      list = (ListView)findViewById(R.id.listView1);
	      //Context WIFI_SERVICE might be the wrong way to do this
	      mainWifiObj = (WifiManager) getSystemService(Context.WIFI_SERVICE);
	      wifiManagerService = new WifiManagerService();
	      mainWifiObj.startScan();
	}
	
	   protected void onPause() {
		      unregisterReceiver(wifiManagerService);
		      super.onPause();
		   }
	   
	   protected void onResume() {
		      registerReceiver(wifiManagerService, new IntentFilter(
		      WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
		      super.onResume();
		   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wifi_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_wifi_manager,
					container, false);
			return rootView;
		}
	}

}
