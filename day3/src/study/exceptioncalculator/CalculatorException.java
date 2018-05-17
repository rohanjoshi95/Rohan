package study.exceptioncalculator;

public class CalculatorException {

  public int calcutate(int n,int p) throws Exception
  {
    int result = 1;
    if((n < 0) || (p < 0))
    {
      throw new Exception("n or p should not be negative");
    }
    if((n == 0) || (p == 0))
    {
      throw new Exception("n or p should not be zero");
    }
    
    for (int i = 0; i < p; i++) {
      result*=n;
    }
    
    
    return result;
    
  }
  
}
