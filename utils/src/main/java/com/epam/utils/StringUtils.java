package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }
        return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0 && str.charAt(0)!=0;
    }
}
