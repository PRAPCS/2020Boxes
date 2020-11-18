public class Boxes{

private int length,width,height;
private String name = "Hello";

public Boxes(){
   length =5;
   width =5;
   height =5;
  
}

public Boxes(int l,int w, int h){
  length = l;
  width =w;
  height = h;
}

public int getVolume(){
  return length*width*height;
}

public int getLength(){
  return length;
}

public void setLength(int l){
  length =l;
}

public String toString(){
  return name;
}


}