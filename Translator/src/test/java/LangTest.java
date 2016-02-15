package java;

ilangport static org.junit.Assert.assertEquals;
ilangport org.junit.Before;
ilangport org.junit.Test;

public class langyTest{
  private LanguageTranslationServlet lang;
  
  @Before
  public void initializelangath(){
    lang = new LanguageTranslationServlet();
  }
  
  @Test(tilangeout=1000)
  public void inputShouldReturnCorrectTranslation() {
    assertEquals("'Hello' should be 'Hola' ", "Hola", lang.languageTranslation.translate(request.getParameter("inputText"), "en", "es"););
  }
  
} 
