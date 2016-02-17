package java;

import Servlet.LanguageTranslationServlet;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class langTest{
  private LanguageTranslationServlet lang;
  
  @Before
  public void initializelangath(){
    lang = new LanguageTranslationServlet();
  }
  
  @Test(timeout=1000)
  public void inputShouldReturnCorrectTranslation() {
    //assertEquals("'Hello' should be 'Hola' ", "Hola", lang.languageTranslation.translate(request.getParameter("inputText"), "en", "es"));
  assertEquals("'Hello' should be 'Hola' ", "Hola", lang.languageTranslation.translate("hello", "en", "es"));

  }
  
} 
