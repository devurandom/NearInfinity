// Near Infinity - An Infinity Engine Browser and Editor
// Copyright (C) 2001 - 2005 Jon Olav Hauglid
// See LICENSE.txt for license information

package infinity.icon;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public final class Icons
{
  private static final Map<String, ImageIcon> ICONMAP = new HashMap<String, ImageIcon>(50);

  public static ImageIcon getIcon(String name)
  {
    ImageIcon icon = ICONMAP.get(name);
    if (icon == null) {
      java.net.URL resource = Icons.class.getResource(name);
      if (resource == null) {
        icon = new ImageIcon();
        System.err.println("Icon file not found: " + name);
      }
      else {
        icon = new ImageIcon(resource);
      }
      ICONMAP.put(name, icon);
    }
    return icon;
  }

  private Icons(){}
}

