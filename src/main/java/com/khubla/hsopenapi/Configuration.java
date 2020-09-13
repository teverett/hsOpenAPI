package com.khubla.hsopenapi;

import java.io.*;
import java.util.*;

import com.khubla.hsclient.*;

/**
 * @author Tom Everett
 *         <p>
 *         Copyright (C) 2020,tom@khubla.com
 *         </p>
 */
public class Configuration {
	private static final String FILENAME = "hsopenapi.properties";
	private static Configuration instance = null;

	public static Configuration getInstance() {
		if (null == instance) {
			instance = new Configuration();
		}
		return instance;
	}

	private Integer httpPort;
	private HSConfiguration hsConfiguration;

	private Configuration() {
		load();
	}

	public HSConfiguration getHsConfiguration() {
		return hsConfiguration;
	}

	public Integer getHttpPort() {
		return httpPort;
	}

	private void load() {
		try {
			final Properties properties = new Properties();
			properties.load(new FileInputStream(FILENAME));
			hsConfiguration = new HSConfiguration(properties.getProperty("hsurl"), properties.getProperty("hsuser"), properties.getProperty("hspassword"));
			/*
			 * http
			 */
			httpPort = Integer.parseInt(properties.getProperty("http.port"));
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
