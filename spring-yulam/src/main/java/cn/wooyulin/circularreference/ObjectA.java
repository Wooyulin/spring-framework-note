package cn.wooyulin.circularreference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectA {
	@Autowired
	private ObjectB b;

	public ObjectB getB() {
		return b;
	}
}
