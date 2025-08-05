package com.payment.gateway.config;

import java.lang.reflect.Field;

import org.springframework.stereotype.Component;

@Component
public class MapperUtils {

	public <S, T> T map(S source, Class<T> targetClass) {
        try {
            T target = targetClass.getDeclaredConstructor().newInstance();
            for (Field sourceField : source.getClass().getDeclaredFields()) {
                sourceField.setAccessible(true);
                try {
                    Field targetField = targetClass.getDeclaredField(sourceField.getName());
                    targetField.setAccessible(true);
                    targetField.set(target, sourceField.get(source));
                } catch (NoSuchFieldException ignored) {}
            }
            return target;
        } catch (Exception e) {
            throw new RuntimeException("Mapping failed", e);
        }
    }
}
