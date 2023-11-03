package com.authority.device.mapper;import com.authority.device.model.Device;import com.authority.device.payload.request.DeviceRequest;import com.authority.device.payload.response.DeviceResponse;import org.mapstruct.Mapper;import org.mapstruct.ReportingPolicy;import org.mapstruct.factory.Mappers;@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")public interface DeviceMapper {    DeviceMapper INSTANCE = Mappers.getMapper(DeviceMapper.class);    Device toDevice(DeviceRequest deviceRequest);    DeviceResponse toDeviceResponse(Device device);}