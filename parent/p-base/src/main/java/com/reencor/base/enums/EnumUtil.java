package com.reencor.base.enums;

public enum EnumUtil {
    UNVALIDATE(0),VALIDATED(1);
    int value;
    EnumUtil(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(EnumUtil.UNVALIDATE.getValue());
    }
}
