package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args.isEmpty()){
            return false;
        } else {
            return args.stream().allMatch(s-> StringUtils.isPositiveNumber(s));
        }
    }
}