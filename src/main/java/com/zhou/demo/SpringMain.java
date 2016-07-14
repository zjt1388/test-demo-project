package com.zhou.demo;

import org.apache.log4j.Logger;

/**
 * Created by zhouj on 2016/7/10.
 */
public class SpringMain {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        // just log a message
        logger.info("Info Log.");
        logger.warn("Warn Log");
        logger.error("Error Log.");
        System.exit(0);
    }
}
