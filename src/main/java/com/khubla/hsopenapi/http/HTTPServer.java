/*
 * Copyright (C) khubla.com - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Tom Everett <tom@khubla.com>, 2020
 */
package com.khubla.hsopenapi.http;

import java.net.*;

import javax.servlet.*;

import org.apache.cxf.endpoint.*;
import org.apache.cxf.jaxrs.*;
import org.apache.cxf.jaxrs.lifecycle.*;
import org.openapitools.api.*;

import com.fasterxml.jackson.jaxrs.json.*;
import com.khubla.hsopenapi.impl.*;
/*
 * https://github.com/apache/cxf/tree/master/distribution/src/main/release/samples/jax_rs
 */

public class HTTPServer {
	/**
	 * http port
	 */
	private final int port;
	/**
	 * server
	 */
	private Server server;
	/*
	 * server factory
	 */
	private JAXRSServerFactoryBean jaxrsServerFactoryBean;

	public HTTPServer(int port) throws ServletException, MalformedURLException {
		this.port = port;
	}

	public void start() throws Exception {
		jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
		jaxrsServerFactoryBean.setResourceClasses(HomeseerApi.class);
		jaxrsServerFactoryBean.setResourceProvider(HomeseerApi.class, new SingletonResourceProvider(new HomeseerApiImpl()));
		jaxrsServerFactoryBean.setProvider(new JacksonJsonProvider());
		jaxrsServerFactoryBean.setAddress("http://localhost:" + Integer.toString(port) + "/");
		// jaxrsServerFactoryBean.setProvider(new DuetyBasicAuthAuthenticationFilter());
		server = jaxrsServerFactoryBean.create();
	}

	public void stop() throws Exception {
		server.stop();
		server.destroy();
		jaxrsServerFactoryBean.getBus().shutdown(true);
	}
}