package org.ikinsure.editor;

public class Result {

    private final int start;
    private final int end;

    public Result(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
