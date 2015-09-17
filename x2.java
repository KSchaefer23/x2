//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Kevin Schaefer  (CST 112; 9/16/15)

//////// Please change these to your name and today's date.
String author=  "Kevin Schaefer";
String title=  "X2 Hero Chase";
String help=  " Click to relocate hero \n 'q' to quit; 'r' to reset. ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;
float sunX, sunY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
  sunX= width*3/4;
  sunY= height/8;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
}

//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  background(0,200,255);                    // sky
  fill(255,255,0);
  
  sunX= (sunX + .75) % (width+100);
  sunY= (sunY + .1) % (horizon + 40);
  ellipse(sunX,sunY, 60,60 );               // sun
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  fill(6,118,7);
  triangle( 110,horizon-10, 150,horizon-45, 190,horizon-10  );  // bottom
  triangle( 120,horizon-30, 150,horizon-60, 180,horizon-30  );  // mid
  triangle( 130,horizon-50, 150,horizon-70, 170,horizon-50  );  // top
  fill(204,102,0);
  rect(140, horizon-10, 20,10 );
  
  rect(30,horizon-60, 60,60);                                          // house
  fill(245,245,245);
  rect(40,horizon-50, 15,15);                                          // window
  rect(65,horizon-50, 15,15);                                          // window
  fill(255,0,0);
  rect(50,horizon-30, 20,30);                                          // door
  fill(255,255,0);
  ellipse(65, horizon-15, 5,5 );                                       // knob
  fill(118,62,6);
  triangle( 30,horizon-60, 60,horizon-90, 90,horizon-60);              // roof
  /* REPLACE THIS STUB! */  text( "scene", 100, 100 );
}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}

//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "[[[[ Zoog. ]]]]", 200, 200 );
  fill(0,200,200);
  rect(x-20,y, 70,10);                   // body
  rect( x,y, 30,50 );        
  ellipse(x+15, y-10, 20, 20);
  fill(255,255,255);
  ellipse(x+10, y-12, 6, 6);             // eyes
  ellipse(x+20, y-12, 6, 6);
  fill(0,0,0);
  ellipse(x+10, y-12, 2, 2);
  ellipse(x+20, y-12, 2, 2);
  fill(255,0,0);
  arc(x+15,y-7, 10,10, 0, PI, CHORD);    // smile
  text( "Blue", x+3,y+20 );
  
  x = x + dx;                            // makes hero move away
  if (x>width-20) { dx= -dx; }
  if (x<1) { dx= -dx; }
  y = y + dy;
  if (y<20 || y>height-20) {
    dy= -dy;
  }
}
void dog() {
  dogX=  dogX - (dogX-x)/30;
  dogY=  dogY - (dogY-y)/40;
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  //
  fill( 124,83,6 );
  rect(dogX-20,dogY, 5,20);
  rect(dogX-12,dogY, 5,20);
  rect(dogX+15,dogY, 5,20);
  rect(dogX+7,dogY, 5,20);
  ellipse(dogX,dogY, 40,20 );
  ellipse(dogX-20,dogY-15, 20,20);
  // if(x<dogX) { ellipse(dogX-20,dogY-15, 20,20); }
  // if(x>dogX) { ellipse(dogX+20,dogY-15, 20,20); }
  /* INSERT YOUR CODE HERE! */
  /* REPLACE THIS STUB! */  text( "woof, woof!!!", 150, 150 );
}





//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
  /* INSERT YOUR CODE HERE! */
}
   
   

