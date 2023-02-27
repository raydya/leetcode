package com.raydya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DesignAnOrderedStream {

    public static class OrderedStream {

        private final String[] stream;
        private int ptr = 0;

        public OrderedStream(int n) {
            stream = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            final int i = idKey - 1;
            stream[i] = value;
            if (i == ptr) {
                int k = ptr;
                final List<String> r = new ArrayList<>();
                while (k < stream.length) {
                    final String s = stream[k];
                    if (Objects.isNull(s)) {
                        break;
                    }
                    r.add(s);
                    k++;
                }
                ptr = k;
                return r;
            }
            return Collections.emptyList();
        }
    }
}
