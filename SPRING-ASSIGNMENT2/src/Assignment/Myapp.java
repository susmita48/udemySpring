package Assignment;


import org.springframework.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Myapp {

	public static void main(String[] args) {
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("C:\\Users\\susmita\\Desktop\\udemy spring\\SPRING-ASSIGNMENT2\\src\\resources\\applicationContext.xml");	
				// retrieve bean from spring container
				Coach theCoach = context.getBean("Basketball", Coach.class);
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				System.out.println(theCoach.getDailyFortune());
				
				// close the context
				context.close();
			}

		}

