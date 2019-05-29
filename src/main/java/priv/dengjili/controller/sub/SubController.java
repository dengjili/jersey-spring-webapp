/**
 * <p>Title: SubController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.controller.sub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * Title: SubController
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: Ericsson
 * </p>
 * 
 * @author dengjili
 * @date 2019年5月29日 上午10:10:40
 */

@Controller
public class SubController {
	@RequestMapping("/test23333")
	public String showMessage() {
		return "test23333";
	}
}
