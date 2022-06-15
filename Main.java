class Main
{
  public static void main(String[] args)
  {
    String[] words = {"avalanche", "budget", "cannot", "center", "meaning", "clear", "furniture", "deep", "piccolo", "friendly", "potatoes", "nanotechnology"};
int c = 0;
for (int i = 0; i < words.length; i++)
{ 
  if (words[i].substring(0, 3).indexOf("o") >= 0)
  {
    c++;
  }
}
System.out.println();
System.out.println(c);
  }
}