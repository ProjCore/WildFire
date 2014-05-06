package wildfire;

import java.util.ArrayList;
import java.util.List;

import wildfire.File;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

class FileController {

	List<File> index(Activity activity){
		
		Parse.initialize(activity, "LDvHEhnNfSJnmxxLPVDnhUdWLY7ATaWuLdOdT151", "0BUvOzWv9W68p30uxsqq2aTBPDU5qhPwYEBPOCtJ");
		ParseQuery<ParseObject> FileTable = ParseQuery.getQuery("File");
		List<ParseObject> parseResults = new ArrayList<ParseObject>();
		List<File> files = new ArrayList<File>();
		File file = new File();
		
		try {
			parseResults = FileTable.find();
			
			 for(ParseObject parseObject : parseResults )
			 {
				 Toast.makeText(activity, parseObject.getString("file_name"), Toast.LENGTH_SHORT).show();
				
				 file.setFile_name(parseObject.getString("file_name"));
				 file.setFile(parseObject.getParseFile("file").getData());
				 files.add(file);
				
			 }
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	 void create( Activity activity, View view ){
		// Context context;
		 Parse.initialize(activity, "LDvHEhnNfSJnmxxLPVDnhUdWLY7ATaWuLdOdT151", "0BUvOzWv9W68p30uxsqq2aTBPDU5qhPwYEBPOCtJ");
		 //ParseObject FileTable = new ParseObject("WildFire");
		 ParseQuery<ParseObject> query = ParseQuery.getQuery("File");
		 List<ParseObject> results = new ArrayList<ParseObject>();
		try {
			results = query.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(ParseObject p : results)
		 {
			 
			 System.out.println(p.getString("file_name"));
			 Toast.makeText(activity, p.getString("file_name"), Toast.LENGTH_SHORT).show();
			 
		 }
		 
		 //FileTable.put("foo", "bar");
		 //FileTable.saveInBackground();
		// (Activity)context.getApplicationContext();
	 }
	//show
	
	
	
}
