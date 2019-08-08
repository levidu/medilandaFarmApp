package models;

import java.util.HashSet;

import java.util.Set;
import io.ebean.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class CountRecord extends Model {
	
		
	public String uid;
	public String cage;
	@Id
	public String date_time;
	public String user;
	public Integer egg_count;
	public Integer damage_count;
	public Integer dirty_count;
	public Integer damaged_on_counter;
	

	

	public String getUid() {
		return uid;
	}




	public void setUid(String uid) {
		this.uid = uid;
	}




	public String getCage() {
		return cage;
	}




	public void setCage(String cage) {
		this.cage = cage;
	}




	public String getDate_time() {
		return date_time;
	}




	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}




	public String getUser() {
		return user;
	}




	public void setUser(String user) {
		this.user = user;
	}




	public Integer getEgg_count() {
		return egg_count;
	}




	public void setEgg_count(Integer egg_count) {
		this.egg_count = egg_count;
	}




	public Integer getDamage_count() {
		return damage_count;
	}




	public void setDamage_count(Integer damage_count) {
		this.damage_count = damage_count;
	}




	public Integer getDirty_count() {
		return dirty_count;
	}




	public void setDirty_count(Integer dirty_count) {
		this.dirty_count = dirty_count;
	}




	public Integer getDamaged_on_counter() {
		return damaged_on_counter;
	}




	public void setDamaged_on_counter(Integer damaged_on_counter) {
		this.damaged_on_counter = damaged_on_counter;
	}




	public static Finder<String,CountRecord> find = new Finder<>(CountRecord.class);
	
	
	
	
}
