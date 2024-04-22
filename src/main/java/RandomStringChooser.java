import java.util.*;
public class RandomStringChooser
{
  public String[] stringPool;

  public RandomStringChooser(String[] words){
    stringPool = new String[words.length];
    for(int i=0; i<words.length; i++)
      stringPool[i] = words[i];
  }

  public String getNext(){
    if(stringPool.length == 0)
      return "NONE";
    int removeIndex = (int) (Math.random()*stringPool.length)
    String result = stringPool[removeIndex];
    stringPool = stringPool.substring(0,removeIndex) + stringPool.substring(removeIndex+1);
    return result;
  }
  
}
