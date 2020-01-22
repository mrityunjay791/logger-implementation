package com.mrityunjay.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.logger.service.Student;
import com.mrityunjay.logger.service.StudentInterface;

/**
 * Logger implementation..
 * 
 * @author mrityunjaykumar
 *
 */
@RestController
public class LoggingController {
	
	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	 
    @RequestMapping("/log-value")
    public String getDetails() {
        logger.trace("Tracing message... ");
        logger.debug("DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        
        StudentInterface s = new Student(12);
        
        System.out.println("roll:= "+ s.getRoll()+" messsage: "+ s.generalMessage());
        
        int num1 = 19;
        
        try {
			double result = num1/4;
			System.out.println(result);
		} catch (Exception e) {
			logger.info("Devide by zero exception"+e);
			e.printStackTrace();
		}
 
        return "Howdy! Check out the Logs to see the output...";
    }
}
