package com.capstone.flexibletrack.util;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class ObjectMapperUtils {

	private static ModelMapper modelMapper = new ModelMapper();
	
	static {
		modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}
	
	public static <D, T> D map(final T entity, Class<D> outClass) {
		return modelMapper.map(entity, outClass);
	}
	
	public static <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outClass) {
		return entityList.stream().map(entity -> map(entity, outClass)).collect(Collectors.toList());
	}
}
