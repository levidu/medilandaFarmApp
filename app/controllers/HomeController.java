package controllers;

import play.mvc.*;



import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.DynamicForm;

import views.html.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.inject.Inject;

import akka.dispatch.sysmsg.Create;
import models.CheckinRecord;
import models.CountRecord;
import models.ManualRecord;





/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
	
	@Inject
	FormFactory formFactory;
	
	public Result main() {
        return ok(views.html.main.render());
    }
	    
	    
    
    //checkin create
    public Result check_in_create() {
    	Form<CheckinRecord> checkinRecordForm = formFactory.form(CheckinRecord.class);
    	return ok(checkin.render(checkinRecordForm));
		
    }
    
    //checkin save
    public Result check_in_save() {
  
    	Form<CheckinRecord> checkinRecordForm = formFactory.form(CheckinRecord.class).bindFromRequest();
    	CheckinRecord record = checkinRecordForm.get();
    	record.save();
    	return redirect("/");
    }
    
    
  //countout create
    public Result count_out_create() {
    	Form<CountRecord> checkinRecordForm = formFactory.form(CountRecord.class);
    	return ok(countout.render(checkinRecordForm));
		
    }
    
    //countout save
    public Result count_out_save() {
  
    	Form<CountRecord> countoutRecordForm = formFactory.form(CountRecord.class).bindFromRequest();
    	CountRecord record = countoutRecordForm.get();
    	record.save();
    	return redirect("/");
    }
    
    
    //Checkin edit -> list, edit, delete
    
    
    public Result checkin_list() {
    	
    	Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		df.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String time = df.format(date);
    	
    	
    	
//    	List<CheckinRecord> checkinList = CheckinRecord.find.all();
    	List<CheckinRecord> checkinList = CheckinRecord.find.query().where().ilike("date_time", "%"+time+"%").findList();
    	
    	return ok(editcheckin.render(checkinList));
    }
    
    
    public Result delete_checkin_row(String date_time) {
    	
    	CheckinRecord checkin_row = CheckinRecord.find.byId(date_time);
    	
    	
    	checkin_row.delete();
    	
    	return redirect("/editcheckin");

    	
    	
    }
    
    
    
    //Count edit
    
       
    public Result countout_list() {
    	
    	Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		df.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String time = df.format(date);
    	
    	
    	
    	List<CountRecord> countoutList = CountRecord.find.query().where().ilike("date_time", "%"+time+"%").findList();
    	
    	return ok(editcountout.render(countoutList));
    }
    
    
    public Result delete_countout_row(String date_time) {
    	
    	CountRecord countout_row = CountRecord.find.byId(date_time);
    	
    	
    	countout_row.delete();
    	
    	return redirect("/editcountout");

    	
    	
    }
    
    public Result manualadd_create() {
    	
    	Form<ManualRecord> manualRecordForm = formFactory.form(ManualRecord.class);

    	return ok(manualadd.render(manualRecordForm));
    }
    
    
    public Result manualadd_save() {
    	  
    	Form<ManualRecord> manualRecordForm = formFactory.form(ManualRecord.class).bindFromRequest();
    	ManualRecord record = manualRecordForm.get();
    	record.save();
    	return redirect("/manualadd");
    }
   

}
