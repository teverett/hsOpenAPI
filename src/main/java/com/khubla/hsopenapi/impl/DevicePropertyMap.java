package com.khubla.hsopenapi.impl;

import org.modelmapper.*;

public class DevicePropertyMap extends PropertyMap<com.khubla.hsclient.domain.Device, org.openapitools.model.Device> {
	@Override
	protected void configure() {
		map().setLastchange(source.getLast_change().getTime());
	}
};