package com.jediterm.terminal.ui;

import java.awt.*;

public class ColorUtil {
  public static Color lessIntensity(Color foregroundColor, Color backgroundColor) {
    return new Color(componentLessIntensity(foregroundColor.getRed(), backgroundColor.getRed()),
      componentLessIntensity(foregroundColor.getGreen(), backgroundColor.getGreen()),
      componentLessIntensity(foregroundColor.getBlue(), backgroundColor.getBlue()),
      foregroundColor.getAlpha());
  }

  public static Color moreIntensity(Color color) {
    return new Color(componentMoreIntensity(color.getRed()),
      componentMoreIntensity(color.getGreen()),
      componentMoreIntensity(color.getBlue()),
      color.getAlpha());
  }

  private static int componentLessIntensity(int foregroundColorComp, int backgroundColorComp) {
    return (foregroundColorComp + backgroundColorComp) / 2;
  }

  private static int componentMoreIntensity(int colorComponent) {
    return (int) Math.min(255, colorComponent + 255 * 0.5f);
  }
}
