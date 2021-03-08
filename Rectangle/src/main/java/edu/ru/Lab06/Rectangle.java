
package edu.ru.Lab06;

public class Rectangle{
 int width;
 int height;

public Rectangle(int width, int height){
    this.width = width;
    this.height= height;
}
public void draw(){
   
        for(int j=0;j<height;j++) {
        for (int k = 0; k < width; k++) {
            System.out.print("X");
        }
        System.out.println("");
        }
}
}


