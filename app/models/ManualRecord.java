package models;

import java.util.HashSet;

import java.util.Set;
import io.ebean.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;


@Entity
public class ManualRecord extends Model {
	
	@Id
	public Integer id;
	public String user;
	public String cage;
	public Integer egg_count;
	public Integer total_damage;
	public String date_time;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getCage() {
		return cage;
	}



	public void setCage(String cage) {
		this.cage = cage;
	}



	public Integer getEgg_count() {
		return egg_count;
	}



	public void setEgg_count(Integer egg_count) {
		this.egg_count = egg_count;
	}



	public Integer getTotal_damage() {
		return total_damage;
	}



	public void setTotal_damage(Integer total_damage) {
		this.total_damage = total_damage;
	}



	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}



	public static Finder<Integer,ManualRecord> find = new Finder<>(ManualRecord.class);
}
