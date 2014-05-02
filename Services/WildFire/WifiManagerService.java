package WildFire;
import java.util.List;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WifiManagerService extends BroadcastReceiver{

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO: This method is called when the BroadcastReceiver is receiving
			// an Intent broadcast.
			//throw new UnsupportedOperationException("Not yet implemented");
			 WifiManager w = null;
			 List<ScanResult> wifiScanList = w.getScanResults();
			 String wifis[] = new String[wifiScanList.size()];
			 
			 for(int i = 0; i < wifiScanList.size(); i++){
			    wifis[i] = ((wifiScanList.get(i)).toString());
			 }
			
			WifiActivity wifiManager = null;
			new ListView(null).setAdapter(new ArrayAdapter<String>(wifiManager.getApplicationContext(),
			 android.R.layout.simple_list_item_1,wifis));
			//comment

			
		}
}
