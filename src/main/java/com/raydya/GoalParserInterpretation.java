package com.raydya;

public class GoalParserInterpretation {

    public String interpret(String command) {
        StringBuilder b = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            final char c = command.charAt(i);
            if (c == 'G') {
                b.append(c);
                i++;
            } else if (c == '(') {
                final char k = command.charAt(i + 1);
                if (k == ')') {
                    b.append('o');
                    i += 2;
                } else if (k == 'a') {
                    b.append("al");
                    i += 4;
                }
            }
        }

        return b.toString();
    }
}
