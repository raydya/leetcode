package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class HtmlEntityParser {

    public String entityParser(String text) {
        final Map<String, String> entityMap = new HashMap<>();
        entityMap.put("&quot;", "\"");
        entityMap.put("&apos;", "'");
        entityMap.put("&amp;", "&");
        entityMap.put("&gt;", ">");
        entityMap.put("&lt;", "<");
        entityMap.put("&frasl;", "/");

        final StringBuilder sb = new StringBuilder();
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            final char c = text.charAt(i);
            if (c == '&') {
                if (builder.length() > 0) {
                    sb.append(builder);
                    builder.setLength(0);
                }
                builder.append(c);
            } else if (c == ';') {
                builder.append(c);
                final String key = builder.toString();
                final String value = entityMap.get(key);
                if (value != null) {
                    sb.append(value);
                } else {
                    sb.append(builder);
                }
                builder.setLength(0);
            } else {
                if (builder.length() > 0) {
                    builder.append(c);
                } else {
                    sb.append(c);
                }
            }
        }

        if (builder.length() > 0) {
            sb.append(builder);
        }

        return sb.toString();
    }

}
