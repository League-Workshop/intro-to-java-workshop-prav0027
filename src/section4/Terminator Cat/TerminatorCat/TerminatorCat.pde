PImage catPic;
int x = 416;
int y = 317;
int acceleration = 5;
int width = 800;
void setup(){
  size(800,600);
  catPic = loadImage("cat.jpg");
  catPic.resize(800,600);
  background(catPic);
}
void draw(){
if(mousePressed){
 println("Mouse's x-position: "+mouseX+"/n. Mouse's y-position: " +mouseY+"/n");
}
noStroke();
fill(255,0,0);
ellipse(x, y, 30, 40);
noStroke();
fill(255,0,0);
ellipse(x-103, y-6, 30, 40);
if(x>width){
background(catPic);
x=416;
y=317;
}
}
void keyPressed(){
 x+=acceleration;
 y+=acceleration;
}