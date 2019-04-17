package com.class23;

public class Test {
	public static void main(String[] args) {
		//creating Employee object
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();
		//emp.work();-mot preffered way
		Employee.work();
		
		
		System.out.println("------Scrum team object-----------");
		//creating ScrumTeam object
		ScrumTeam st=new ScrumTeam();
		Developer.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		st.workOnArtifacts();
		
		System.out.println("---------Developer object----------");
		//creating Developer object
		Developer dev=new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		dev.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		dev.workOnArtifacts();
		dev.code();

		System.out.println("---------Tester  object------------");
		//creating Tester object
		Tester tester=new Tester();
		tester.salary=100000;
		tester.getPaid();
		tester.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		tester.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		tester.workOnArtifacts();
		tester.test();
		

		System.out.println("-----------BussinessAnalyst object-----------");
		//creating BA object
		BussinessAnalyst ba=new BussinessAnalyst();
		ba.salary=120000;
		ba.getPaid();
		ba.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		ba.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		ba.workOnArtifacts();
		ba.writeUserStories();
		
		System.out.println("-----------ScrumMaster object------------");
		//creating ScrumMaster object
		ScrumMaster sm=new ScrumMaster();
		sm.salary=130000;
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		sm.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		sm.driveScrumMeetings();
		
		System.out.println("-----------ProductOwner object------------");
		//creating ScrumMaster object
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		po.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		po.prioritizeBacklog() ;
		po.talkToTheClient();
		
		System.out.println("---------FrontEnd object----------");
		//creating FrontEnd object
		FrontEnd  fe=new FrontEnd();
		fe.salary=130000;
		fe.getPaid();
		fe.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		fe.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		fe.workOnArtifacts();
		fe.code();
		fe.doHtml();
		System.out.println("---------BackEnd object----------");
		//creating BackEnd object
		BackEnd  be=new BackEnd();
		be.salary=135000;
		be.getPaid();
		be.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		be.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		be.workOnArtifacts();
		be.code();
		be.doSgl();
		
		System.out.println("---------Manual tester----------");
		//creating Manual Tester object
		ManualTester  mt=new ManualTester();
		mt.salary=60000;
		mt.getPaid();
		mt.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		mt.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		mt.workOnArtifacts();
		mt.test();
		mt.manual();
		
		System.out.println("---------Automation tester----------");
		//creating Automation Tester object
		AutomationTester  at=new AutomationTester();
		at.salary=110000;
		at.getPaid();
		at.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		at.ceremonies="Sprint grooming, Sprint Planning, Dayli StandUp, Sprint Demo, Sprint Retrospective";
		at.workOnArtifacts();
		at.test();
		at.codeINJAVA();
		
		
		
	}

}
