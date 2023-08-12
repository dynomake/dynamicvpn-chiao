package me.dynomake.vpn.chiao.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class OutlineKey {

    UUID localIdentifier; // identifier on key's server
    String key; // key's text (using to connect)
}
