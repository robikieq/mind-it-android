package com.thoughtworks.mindit.constant;


public class Fields {

    public static final String NAME = "name";
    public static final String CHILD_SUBTREE = "childSubTree";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String PARENT_ID = "parentId";
    public static final String POSITION = "position";
    public static final String ROOT_ID = "rootId";
    public static final String INDEX = "index";


    public enum UPDATE_OPTIONS_FOR_PRESENTER {
        ADD("ADD"),
        UPDATE("UPDATE"),
        DELETE("DELETE");

        private final String name;

        UPDATE_OPTIONS_FOR_PRESENTER(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }
}
