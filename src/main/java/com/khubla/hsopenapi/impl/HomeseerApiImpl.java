package com.khubla.hsopenapi.impl;

import java.io.*;
import java.util.*;

import javax.ws.rs.*;

import org.modelmapper.*;
import org.openapitools.api.*;
import org.openapitools.model.Counter;
import org.openapitools.model.Device;
import org.openapitools.model.Event;
import org.openapitools.model.SessionConfig;
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

	@Override
	public void controlDeviceByLabel(Integer ref, String label) {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			hsClient.controlDeviceByLabel(ref, label);
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	@Override
	public void controlDeviceByValue(Integer ref, Double value) {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			hsClient.controlDeviceByValue(ref, value);
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/changeddevices
	@Override
	public List<Integer> getChangedDevices() {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			return hsClient.getChangedDevices();
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/counter/{name}
	@Override
	public Counter getCounter(String name) {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final com.khubla.hsclient.domain.Counter counter = hsClient.getCounter(name);
			if (null != counter) {
				return modelMapper.map(counter, Counter.class);
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/device/{ref}
	@Override
	public Device getDevice(Integer ref) {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final com.khubla.hsclient.domain.Device device = hsClient.getDevice(ref);
			if (null != device) {
				return modelMapper.map(device, Device.class);
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/devices
	@Override
	public List<Device> getDevices() {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final Map<Integer, com.khubla.hsclient.domain.Device> map = hsClient.getDevicesByRef();
			if (null != map) {
				final List<Device> devices = new ArrayList<Device>();
				for (final com.khubla.hsclient.domain.Device device : map.values()) {
					devices.add(modelMapper.map(device, Device.class));
				}
				return devices;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/events
	@Override
	public List<Event> getEvents() {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final Map<Integer, com.khubla.hsclient.domain.Event> map = hsClient.getEventsById();
			if (null != map) {
				final List<Event> events = new ArrayList<Event>();
				for (final com.khubla.hsclient.domain.Event event : map.values()) {
					events.add(modelMapper.map(event, Event.class));
				}
				return events;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	/**
	 * get logged in HSClient
	 *
	 * @return an HSClient
	 * @throws HSClientException
	 * @throws IOException
	 */
	private HSClient getHSClient() throws HSClientException, IOException {
		final HSClient ret = new HSClientImpl();
		ret.connect(Configuration.getInstance().getHsConfiguration());
		return ret;
	}

	// /homeseer/locations1
	@Override
	public List<String> getLocations1() {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			final List<String> lst = hsClient.getLocations1();
			if (null != lst) {
				return lst;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
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
			final List<String> lst = hsClient.getLocations2();
			if (null != lst) {
				return lst;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	private ModelMapper getModelMapper() {
		final ModelMapper ret = new ModelMapper();
		ret.addMappings(new DevicePropertyMap());
		ret.addMappings(new UserPermissionsPropertyMap());
		return ret;
	}

	// /homeseer/sessionconfig
	@Override
	public SessionConfig getSessionConfig() {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final com.khubla.hsclient.domain.SessionConfig sessionConfig = hsClient.getSessionConfig();
			if (null != sessionConfig) {
				return modelMapper.map(sessionConfig, SessionConfig.class);
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	@Override
	public String getSetting(String name) {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			final String ret = hsClient.getSetting(name);
			if (null != ret) {
				return ret;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	// /homeseer/getsystems
	@Override
	public List<System> getSystems() {
		HSClient hsClient = null;
		try {
			final ModelMapper modelMapper = getModelMapper();
			hsClient = getHSClient();
			final List<HSSystem> lst = hsClient.getSystems();
			if (null != lst) {
				final List<System> systems = new ArrayList<System>();
				for (final HSSystem hsSystem : lst) {
					systems.add(modelMapper.map(hsSystem, System.class));
				}
				return systems;
			} else {
				throw new NotFoundException();
			}
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	@Override
	public String getVersion() {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			return hsClient.getVersion();
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}

	@Override
	public void runEvent(Integer id) {
		HSClient hsClient = null;
		try {
			hsClient = getHSClient();
			hsClient.runEvent(id);
		} catch (final Exception e) {
			throw new InternalServerErrorException(e);
		} finally {
			try {
				if (null != hsClient) {
					hsClient.close();
				}
			} catch (final Exception e) {
				logger.warn("Exception closing HSClient", e);
			}
		}
	}
}
