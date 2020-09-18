package com.khubla.hsopenapi.impl;

import org.modelmapper.*;

public class UserPermissionsPropertyMap extends PropertyMap<com.khubla.hsclient.domain.UserPermissions, org.openapitools.model.UserPermissions> {
	@Override
	protected void configure() {
		map().setUserPermissionsValid(source.getUser_permissions_valid());
	}
};