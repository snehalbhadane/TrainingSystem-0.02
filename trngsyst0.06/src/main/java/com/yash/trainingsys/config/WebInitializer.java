package com.yash.trainingsys.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	    @Override
	    protected Class <? > [] getRootConfigClasses() {
	        return new Class[] {
	        		WebContext.class
	        };
	        //return null;
	    }

	    @Override
	    protected Class <? > [] getServletConfigClasses() {
	        return new Class[] {
	            TrainingAppConfiguration.class
	        };
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] {
	            "/"
	        };
	    }


		
	}

