/**
 * <p>Title: Hello.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.service;

import org.springframework.stereotype.Service;

/**
 * <p>Title: Hello</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 上午9:42:28
 */
@Service
public class Hello {
	public String toMessage() {
		return "Hello";
	}
}
