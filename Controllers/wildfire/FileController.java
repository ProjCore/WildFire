package wildfire;

import java.util.List;

import wildfire.File;
import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

class FileController {

	List<File> index(){
		return null;
		
	}
	
	 void create( Activity activity, View view ){
		// Context context;
		 Parse.initialize(activity, "LDvHEhnNfSJnmxxLPVDnhUdWLY7ATaWuLdOdT151", "0BUvOzWv9W68p30uxsqq2aTBPDU5qhPwYEBPOCtJ");
		 ParseObject testObject = new ParseObject("TestObject");
		 testObject.put("foo", "bar");
		 testObject.saveInBackground();
		// (Activity)context.getApplicationContext();
	 }
	//show
	
	
	
}
