package models;

import java.util.HashSet;
import java.util.Set;


import io.ebean.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;


@Entity
public class CheckinRecord extends Model {
	
	
	
	public String uid;
	@Id
	public String date_time;
	public String cage;
	
	

	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}



	public String getCage() {
		return cage;
	}



	public void setCage(String cage) {
		this.cage = cage;
	}



	public static Finder<String,CheckinRecord> find = new Finder<>(CheckinRecord.class);
	
	
	
	
}
