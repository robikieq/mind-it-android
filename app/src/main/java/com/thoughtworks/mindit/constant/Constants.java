package com.thoughtworks.mindit.constant;

public class Constants {
    public static final int PADDING_FOR_DEPTH = 20;
    public static final int SELECTION_MODE = 25;
    public static final int EDIT_MODE = 30;
    public static final int ADD = 0;
    public static final int DELETE = 1;
    public static final String EMPTY_STRING = "";
    public static final String OK = "OK";
    public static final java.lang.String IMPORT_DIALOG_TITLE = "Enter URL";
    public static final String ROOT_DELETE_ERROR = "Can not delete root node...";
    public static final String FONT_SERIF = "DroidSerif-Bold.ttf";
    public static final String EXCEPTION_NULL_OBSERVER = "Null Observer";

    public enum POSITION {
        LEFT("left"),
        RIGHT("right");

        private final String name;

        POSITION(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }

    public enum STATUS {
        EXPAND("expand"),
        COLLAPSE("collapse");

        private final String value;

        STATUS(String value) {
            this.value = value;
        }

        public String toString() {
            return this.value;
        }
    }

    public enum TREE_UPDATE_OPTIONS {
        ADD(1),
        UPDATE(2),
        DELETE(3);

        private final int value;

        TREE_UPDATE_OPTIONS(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
}