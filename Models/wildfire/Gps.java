package wildfire;

class Gps {
	

	private GeoPoint geo_point = new GeoPoint();

	private float range;
	
	Gps(){
	
	}
	
	GeoPoint getGeo_point() {
		return geo_point;
	}

	void setGeo_point(float longitude, float latitude) {
		this.geo_point.longitude = longitude;
		this.geo_point.latitude = latitude;
	}

	float getRange() {
		return range;
	}

	void setRange(float range) {
		this.range = range;
	}

	class GeoPoint {
		
		float longitude;
		
		float latitude;
		
		float getLongitude() {
			return longitude;
		}
		
		GeoPoint(){
			
		}
		
		GeoPoint(float longitude, float latitude){
			this.longitude =  longitude;
			this.latitude = latitude;
		}

		void setLongitude(float longitude) {
			this.longitude = longitude;
		}

		float getLatitude() {
			return latitude;
		}

		void setLatitude(float latitude) {
			this.latitude = latitude;
		}
	}
	
}
