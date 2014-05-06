package wildfire;

import java.util.List;

class User {

	String username;
	
	Contact contact_info;
	
	List<Contact> contact_list;
	
	List<File> files;
		
	Wifi wifi;
	
	Gps gps;
	
	enum pairing_type {GPS, WiFi, Contacts};
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Contact getContact_info() {
		return contact_info;
	}

	public void setContact_info(Contact contact_info) {
		this.contact_info = contact_info;
	}

	public List<Contact> getContact_list() {
		return contact_list;
	}

	public void setContact_list(List<Contact> contact_list) {
		this.contact_list = contact_list;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public Wifi getWifi() {
		return wifi;
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
	}

	public Gps getGps() {
		return gps;
	}

	public void setGps(Gps gps) {
		this.gps = gps;
	}
	
}
