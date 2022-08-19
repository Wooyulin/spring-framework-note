package cn.wooyulin.circularreference.aop;

import cn.wooyulin.circularreference.ObjectB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectC {
	@Autowired
	private ObjectD d;

	public ObjectD getd() {
		return d;
	}
}
