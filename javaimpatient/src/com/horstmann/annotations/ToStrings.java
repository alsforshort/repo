// Automatically generated by com.horstmann.annotations.ToStringAnnotationProcessor
package com.horstmann.annotations;

public class ToStrings {
  public static String toString(ch11.sec05.Point obj) {
    return new StringBuilder()
            .append('[')
            .append(toString(obj.getX()))
            .append(',')
            .append(toString(obj.getY()))
            .append(']')
            .toString();
  }

  public static String toString(ch11.sec05.Rectangle obj) {
    return new StringBuilder()
            .append("ch11.sec05.Rectangle[")
            .append(toString(obj.getTopLeft()))
            .append(", width=")
            .append(toString(obj.getWidth()))
            .append(", height=")
            .append(toString(obj.getHeight()))
            .append(']')
            .toString();
  }

  public static String toString(Object obj) {
    return java.util.Objects.toString(obj);
  }
}
