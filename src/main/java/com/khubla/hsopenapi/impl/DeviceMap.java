package com.khubla.hsopenapi.impl;

import org.modelmapper.*;

public class DeviceMap extends PropertyMap<com.khubla.hsclient.domain.Device, org.openapitools.model.Device> {
	protected void configure() {
		if (null != source.getLast_change()) {
			map().setLastchange(source.getLast_change().getTime());
		}
	}
};