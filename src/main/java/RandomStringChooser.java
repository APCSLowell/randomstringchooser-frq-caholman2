import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String>stringPool;

  public RandomStringChooser(String[] words){
    stringPool = new ArrayList<String>();
    for(int i=0; i<words.length; i++)
      stringPool.add(words[i]);
  }

  public String getNext(){
    if(stringPool.size() == 0)
      return "NONE";
    int removeIndex = (int) (Math.random()*stringPool.size());
    String result = stringPool.get(removeIndex);
    stringPool.remove(removeIndex);
    return result;
  }
  
}
