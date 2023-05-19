package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;
public class HelloApp{
	public static void main(String[] args) {
		        GenericXmlApplicationContext ctx = new 
				GenericXmlApplicationContext("classpath*:applicationContext.xml");
				MessageBean g1 = (MessageBean)ctx.getBean("messageBean");
				MessageBean g2 = (MessageBean)ctx.getBean("messageBean");
				System.out.println("(g1==g2)=" + (g1==g2));
				ctx.close();
		}
	}

