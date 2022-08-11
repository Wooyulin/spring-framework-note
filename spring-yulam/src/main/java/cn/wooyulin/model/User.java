package cn.wooyulin.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author 5yl
 * date: 2021/7/22
 */
@Component
public class User implements BeanNameAware, EmbeddedValueResolverAware, ApplicationContextAware {

	public String name = "yulam";

	private ApplicationContext applicationContext;

	@Override
	public void setBeanName(String name) {
		System.out.println("beanNameAware get name === " + name);
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		String val = resolver.resolveStringValue("当前系统为${os.name},表达式3*8的结果为：#{3*8}");
		System.err.println("解析后的字符串为===" + val);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
