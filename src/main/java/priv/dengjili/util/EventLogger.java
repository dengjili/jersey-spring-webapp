/**
 * <p>Title: EventLogger.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjili.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title: EventLogger</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 下午11:03:11
 */
public class EventLogger
{
    private static Logger logger = LoggerFactory.getLogger("runtime");

    public static void record(Logger runtimeLogger, String msg)
    {
        if (null != msg && msg.length() > 0)
        {
            logger.trace(msg);
            runtimeLogger.info(msg);
        }
    }
}