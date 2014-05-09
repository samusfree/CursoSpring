package com.mycompany.cuentas;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

@SuppressWarnings("rawtypes")
public class StringToEnumConverterFactory implements
		ConverterFactory<String, Enum> {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Enum> Converter<String, T> getConverter(
			Class<T> targetType) {

		return new StringToEnumConverter(targetType);
	}

	private final class StringToEnumConverter<T extends Enum> implements
			Converter<String, T> {

		private Class<T> enumType;

		public StringToEnumConverter(Class<T> targetType) {
			this.enumType = targetType;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T convert(String source) {

			return (T) Enum.valueOf(this.enumType, source.trim());
		}

	}
}
