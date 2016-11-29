package com.sermo.web.serializer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @author sermo
 * @version 2016/11/29.
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {

    private Converter<Object, byte[]> serializer = new SerializingConverter();
    private Converter<byte[], Object> deserializer = new DeserializingConverter();

    public static final byte[] EMPTY_ARRAY = new byte[0];

    @Override
    public byte[] serialize(Object object) throws SerializationException {
        if (object == null){
            return EMPTY_ARRAY;
        }
        return serializer.convert(object);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (isEmpty(bytes)) {
            return null;
        }
        return deserializer.convert(bytes);
    }

    private boolean isEmpty(byte[] data) {
        return (data == null || data.length == 0);
    }
}
