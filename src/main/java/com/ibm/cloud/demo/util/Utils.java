package com.ibm.cloud.demo.util;

import java.util.Random;
import java.util.UUID;

public class Utils {

    public static String getAutoGeneratedId() {
        return new Random().nextInt(10) + ":" +
                UUID.randomUUID().toString().replace("-", "");
    }

}
