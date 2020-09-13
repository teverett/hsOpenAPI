package com.khubla.hsopenapi.impl;

import java.io.*;
import java.util.*;

import javax.ws.rs.*;

import org.modelmapper.*;
import org.openapitools.api.*;
import org.openapitools.model.System;
import org.slf4j.*;

import com.khubla.hsclient.*;
import com.khubla.hsclient.domain.*;
import com.khubla.hsopenapi.*;

public class HomeseerApiImpl implements HomeseerApi {
	/**
	 * logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(HomeseerApiImpl.class);

	/**
	 * get logged in HSClient
	 * 
	 * @return an HSClient
	 * @throws HSClientException
	 * @throws IOException
	 */
	private HSClient getHSClient() throws HSClientException, IOException {
		HSClient ret = new HSClientImpl();
		ret.connect(Configuration.getInstance().getHsConfiguration());
		return ret;
	}

	// /homeseer/getsystems
	@Override
	public List<System> getSystems() {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = new ModelMapper();
			hsClient = getHSClient();
			List<HSSystem> lst = hsClient.getSystems();
			if (null != lst) {
				List<System> systems = new ArrayList<System>();
				for (HSSystem hsSystem : lst) {
					systems.add(modelMapper.map(hsSystem, System.class));
				}
				return systems;
			} else {
				throw new NotFoundException();
			}
		} catch (Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/locations1
	@Override
	public List<String> getLocations1() {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			List<String> lst = hsClient.getLocations1();
			if (null != lst) {
				return lst;
			} else {
				throw new NotFoundException();
			}
		} catch (Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/locations2
	@Override
	public List<String> getLocations2() {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			List<String> lst = hsClient.getLocations2();
			if (null != lst) {
				return lst;
			} else {
				throw new NotFoundException();
			}
		} catch (Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}
}
