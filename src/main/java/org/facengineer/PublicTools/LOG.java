package org.facengineer.PublicTools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LOG {
    private static Logger _log;
    public LOG(Class type){
        _log = LoggerFactory.getLogger(type);
    }

    public static void info(String value){
        _log.info(value);
    }

    public static void error(String value){
        _log.error(value);
    }
}
