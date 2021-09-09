package com.xiangxue.arouter_compiler.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 字符串、集合判空工具
 */
public final class ProcessorUtils {

    // 如果是空 true
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isEmpty(final Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

}
