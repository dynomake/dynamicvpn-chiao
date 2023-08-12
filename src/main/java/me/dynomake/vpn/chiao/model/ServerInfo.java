package me.dynomake.vpn.chiao.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import me.dynomake.vpn.chiao.Country;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ServerInfo {
    Country country;
    int activeConnections;
    int limitConnections;
    String token; // temporary server access token
}
