package com.khubla.hsopenapi.impl;

import java.util.*;

import org.modelmapper.*;

public class DateConverter extends AbstractConverter<Date, Long> {
	@Override
	protected Long convert(Date source) {
		return source.getTime();
	}
}
