package org.jkcsoft.xqs.table;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Table<T> {

    private Set<T> objects;
    private Set<Map<Object, T>> indices = new HashSet();


}
