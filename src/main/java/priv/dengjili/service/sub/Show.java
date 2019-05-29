/**
 * <p>Title: Show.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.service.sub;

import org.springframework.stereotype.Service;

/**
 * <p>Title: Show</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 下午1:13:19
 */
@Service
public class Show {
	public String show() {
		System.out.println("ok");
		return "Hello";
	}
}
