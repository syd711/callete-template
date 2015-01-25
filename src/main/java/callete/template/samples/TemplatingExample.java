package callete.template.samples;

import callete.api.Callete;
import callete.api.services.template.TemplateService;
import callete.api.services.template.TemplateSet;

import java.util.HashMap;
import java.util.Map;

/**
 * Example how to use the FreeMarker templating.
 */
public class TemplatingExample {
  public static void main(String[] args) {
    TemplateService templateService = Callete.getTemplateService();
    TemplateSet set = templateService.createTemplateSetFromPackage(TemplatingExample.class, "");
    
    Map<String,String> model = new HashMap<>();
    model.put("user", "Dummy");
    set.renderTemplate("test.ftl", model, System.out);

  }
}
