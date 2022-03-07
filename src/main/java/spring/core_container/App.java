package spring.core_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("/spring/core_container/applicationContext.xml");
		Player p1=(Player) ac.getBean("football");
		Player p2=(Player) ac.getBean("cricket");
		CricketPlayer ck=(CricketPlayer) ac.getBean("cricket");
		FootballPlayer fb=(FootballPlayer) ac.getBean("football");
		TennisPlayer tp=(TennisPlayer) ac.getBean("tennis");
	    ClassPathXmlApplicationContext ac1=new ClassPathXmlApplicationContext("/spring/core_container/spring_Config.xml");
		RugbyPlayer rb=(RugbyPlayer) ac1.getBean("rugby");
		p2.coachName();
		System.out.println("runs: "+ck.runs+" wins: "+ck.runs+" player_name: "+ck.name+" wickets: "+ck.wickets);
		p1.coachName();
		fb.Game();
		System.out.println("Tennis player rankL: "+tp.rank+"Tennis player coach: "+tp.ct);
		rb.Game();
		
		
	}

}
