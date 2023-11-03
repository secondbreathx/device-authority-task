package com.authority.device.mapper;

import com.authority.device.model.Device;
import com.authority.device.model.Device.DeviceBuilder;
import com.authority.device.payload.request.DeviceRequest;
import com.authority.device.payload.response.DeviceResponse;
import com.authority.device.payload.response.DeviceResponse.DeviceResponseBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T21:55:32+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Homebrew)"
)
@Component
public class DeviceMapperImpl implements DeviceMapper {

    @Override
    public Device toDevice(DeviceRequest deviceRequest) {
        if ( deviceRequest == null ) {
            return null;
        }

        DeviceBuilder device = Device.builder();

        device.deviceId( deviceRequest.getDeviceId() );
        device.accountNo( deviceRequest.getAccountNo() );
        device.osName( deviceRequest.getOsName() );
        device.osVersion( deviceRequest.getOsVersion() );
        device.platform( deviceRequest.getPlatform() );

        return device.build();
    }

    @Override
    public DeviceResponse toDeviceResponse(Device device) {
        if ( device == null ) {
            return null;
        }

        DeviceResponseBuilder deviceResponse = DeviceResponse.builder();

        deviceResponse.deviceId( device.getDeviceId() );
        deviceResponse.accountNo( device.getAccountNo() );
        deviceResponse.osName( device.getOsName() );
        deviceResponse.osVersion( device.getOsVersion() );
        deviceResponse.platform( device.getPlatform() );
        deviceResponse.updateTime( device.getUpdateTime() );

        return deviceResponse.build();
    }
}
