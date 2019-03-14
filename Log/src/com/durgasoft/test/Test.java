package com.durgasoft.test;

import org.apache.log4j.Logger;

public class Test {
    static Logger logger=Logger.getLogger(Test.class);
	public static void main(String[] args) {
      logger.debug("Debugmessage");
      logger.error("Error message");
      logger.fatal("fatal Message");
      logger.info("Info message");
      logger.trace("TraceMessage");
      logger.warn("Warn Message");
	}

}
