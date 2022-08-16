package cn.wooyulin.circularreference;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectB {

	@Autowired
	private ObjectA a;

	public ObjectA getA() {
		return a;
	}

}
