package processing.test.pimage;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class pimage extends PApplet {

PImage photo;
cuadro cuadros[];
PImage imagen[];
public void setup() {
  
  photo = loadImage("jake.jpg");
  photo.resize(500,500);
  cuadros = new cuadro[9];
  imagen = new PImage[9];
  int k=0;
  /*
  for(int i=0;i<3;i++)
    for(int j=0;j<=3;j++){
      if(k>=8)break;
      imagen[k] = photo.get(j*66, i*66,66,66);
      k++;
    }
    */
  imagen[0] = photo.get(0,0,166,166);
  imagen[1] = photo.get(166,0,166,166);
  imagen[2] = photo.get(332,0,166,166);
  
  imagen[3] = photo.get(0,0,166,166);
  imagen[4] = photo.get(166,166,166,166);
  imagen[5] = photo.get(332,0,166,166);
  
  imagen[6] = photo.get(0,332,166,166);
  imagen[7] = photo.get(166,332,166,166);
  imagen[8] = photo.get(332,332,166,166);
}

public void draw() {
  image(imagen[3],0,0);  
  image(imagen[0],166,0);
  image(imagen[2],332,0);
  image(imagen[1],0,166);
  image(imagen[8],166,166);  
  image(imagen[4],332,166);
  image(imagen[7],0,332);
  image(imagen[5],166,332);
  image(imagen[6],332,332);
}
public class cuadro{
  PImage imagen;
  float x,y;
  float ancho, alto;
  byte id;
  
  public boolean isColision(float a, float b){
  
    return true;
  }
}
  public voipackage processing.test.pimage;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class pimage extends PApplet {

PImage photo;
cuadro cuadros[];
PImage imagen[];
public void setup() {
  
  photo = loadImage("jake.jpg");
  photo.resize(500,500);
  cuadros = new cuadro[9];
  imagen = new PImage[9];
  int k=0;
  /*
  for(int i=0;i<3;i++)
    for(int j=0;j<=3;j++){
      if(k>=8)break;
      imagen[k] = photo.get(j*66, i*66,66,66);
      k++;
    }
    */
  imagen[0] = photo.get(0,0,166,166);
  imagen[1] = photo.get(166,0,166,166);
  imagen[2] = photo.get(332,0,166,166);
  
  imagen[3] = photo.get(0,0,166,166);
  imagen[4] = photo.get(166,166,166,166);
  imagen[5] = photo.get(332,0,166,166);
  
  imagen[6] = photo.get(0,332,166,166);
  imagen[7] = photo.get(166,332,166,166);
  imagen[8] = photo.get(332,332,166,166);
}

public void draw() {
  image(imagen[3],0,0);  
  image(imagen[0],166,0);
  image(imagen[2],332,0);
  image(imagen[1],0,166);
  image(imagen[8],166,166);  
  image(imagen[4],332,166);
  image(imagen[7],0,332);
  image(imagen[5],166,332);
  image(imagen[6],332,332);
}
public class cuadro{
  PImage imagen;
  float x,y;
  float ancho, alto;
  byte id;
  
  public boolean isColision(float a, float b){
  
    return true;
  }
}
  public void settings() {  size(500, 500); }
}
