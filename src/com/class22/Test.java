package com.class22;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		//emp.work(); not preferred way
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("---Creating ScrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, Burndown Chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating Developer object---");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa=new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		System.out.println("---Creating BusinessAnalyst object---");
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprint backlog, Product backlog";
		ba.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating ScrumMaster object---");
		ScrumMaster sm=new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burndown Chart";
		sm.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating ProductOwner object---");
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint backlog, Product backlog";
		po.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBackLog();
		po.talkToClient();
		
		System.out.println("---Creating FrontEnd object---");
		FrontEnd frontDev=new FrontEnd();
		frontDev.salary=120000;
		frontDev.getPaid();
		frontDev.artifacts="Sprint backlog";
		frontDev.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		frontDev.workOnArtifacts();
		frontDev.attendScrumMeetings();
		frontDev.code();
		frontDev.doHtml();
		
		System.out.println("---Creating BackEnd object---");
		BackEnd backDev=new BackEnd();
		backDev.salary=120000;
		backDev.getPaid();
		backDev.artifacts="Sprint backlog";
		backDev.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		backDev.workOnArtifacts();
		backDev.attendScrumMeetings();
		backDev.code();
		backDev.doSql();
		
		System.out.println("---Creating ManualTester object---");
		ManualTester manual=new ManualTester();
		manual.salary=100000;
		manual.getPaid();
		manual.artifacts="Sprint backlog";
		manual.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		manual.workOnArtifacts();
		manual.attendScrumMeetings();
		manual.test();
		manual.testManually();
		
		System.out.println("---Creating AutomationTester object---");
		AutomationTester auto=new AutomationTester();
		auto.salary=100000;
		auto.getPaid();
		auto.artifacts="Sprint backlog";
		auto.ceremonies="Sprint grooming, Sprint Planning, Daily Standup, Sprint Demo, Sprint Retro";
		auto.workOnArtifacts();
		auto.attendScrumMeetings();
		auto.test();
		auto.codeInJava();
		
		//private variables and methods cannot get inherited
	}
}
