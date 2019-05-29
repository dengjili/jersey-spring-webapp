/**
 * <p>Title: MyServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.service;

import org.springframework.stereotype.Service;

import priv.dengjili.controller.sub.SubController;
import priv.dengjili.util.SpringContextUtils;

/**
 * <p>Title: MyServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 上午12:07:01
 */
@Service
public class MyServiceImpl implements MyService {

	@Override
	public String toMessage() {
		return "toMessage22222222";
	}
	@Override
	public void print() {
		System.out.println("adsfadsfs");
	}

	@Override
	public void test() {
		Hello pager = SpringContextUtils.getBean(Hello.class);
		System.out.println(pager.toMessage());
		SubController pagerController = SpringContextUtils.getBean(SubController.class);
		System.out.println("========================");
		System.out.println(pagerController.showMessage());
		System.out.println("========================");
	}

}
