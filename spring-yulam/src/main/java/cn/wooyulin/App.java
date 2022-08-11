package cn.wooyulin;

import cn.wooyulin.config.AppConfig;
import cn.wooyulin.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 5yl
 * date: 2021/7/22
 */
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.name);
	}
}
