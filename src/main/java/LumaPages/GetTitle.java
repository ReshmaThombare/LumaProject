package LumaPages;

import LumaBase.LumaBase;

public class GetTitle extends LumaBase
{
    public String getTitle()
    {
      return driver.getCurrentUrl();
    }

}
