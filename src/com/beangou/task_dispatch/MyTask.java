package com.beangou.task_dispatch;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;

public class MyTask extends TimerTask{
	private String job = "";
	
	public MyTask(String job) {
		this.job = job;
	}
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new MyTask("go"), 5000, 1000);
		timer.schedule(new MyTask("go away"), 5000, 1000);
	}
	
	@Override
	public void run() {	
		System.out.println(this.job);	
	}
	
}

class MyScheduledExcutor implements Runnable{
	private String job = "";
	public MyScheduledExcutor(String job) {
		this.job = job;
	}
	
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.scheduleAtFixedRate(new MyScheduledExcutor("test1"), 1, 1, TimeUnit.SECONDS);
		service.scheduleWithFixedDelay(new MyScheduledExcutor("test2"), 1, 1, TimeUnit.SECONDS);
	}
	
	@Override
	public void run() {
		System.out.println(this.job);
	}
}

class MyQuartz implements Job {

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println(arg0.getJobDetail().getDescription()+"=>"+arg0.getJobDetail().getJobDataMap().get("type"));
	}
	
	public static void main(String[] args) {
		try {
			SchedulerFactory factory = new StdSchedulerFactory();
			Scheduler scheduler = factory.getScheduler();
			scheduler.start();
//			JobDetail jobDetail = new JobDetailImpl();
//			JobDetail jobDetail = new JobDetailImpl("myJob", "myJobGroup", MyQuartz.class);
//			Trigger trigger = TriggerUtils.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}