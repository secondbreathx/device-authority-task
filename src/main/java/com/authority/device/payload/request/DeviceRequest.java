package com.authority.device.payload.request;import com.sun.istack.NotNull;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;import java.time.ZonedDateTime;import java.util.UUID;@Data@NoArgsConstructor@AllArgsConstructor@Builderpublic class DeviceRequest {    @NotNull    private  String deviceId;    @NotNull    private  String accountNo;    @NotNull    private  String osName;    @NotNull    private  String platform;    @NotNull    private String osVersion;}