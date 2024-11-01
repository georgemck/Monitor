/* autogenerated by Processing revision 1293 on 2024-10-27 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.lang.Object;
import java.io.IOException;
import java.io.InputStreamReader;
import processing.video.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class Monitor extends PApplet {





//https://toolzu.com/downloader/instagram/video/

Movie video2, video;
PImage image2, newsletter;
float c,d;

public void setup() {
  /*
  try {
      // Get a Runtime object
      Runtime runtime = Runtime.getRuntime();

      // Execute the command (replace "ls -l" with your command)
      Process process = runtime.exec(new String[]{"node", "index.js"});

      // Get the input stream of the process 
      // (you can read the output of the command from this stream)
      InputStream inputStream = process.getInputStream();

      // ... (process the output if needed)
      println("finished");
  } catch (IOException e) {
      e.printStackTrace();
  }
  ffmpeg -i video2.mp4 -c copy -an video2nosound.mp4
  */

  /* size commented out by preprocessor */;
  frameRate(60);
  /* size commented out by preprocessor */;
  videoRunner();
}
public void videoRunner() {

  //https://ohanastar.com/wp-content/uploads/2024/10/
  video = new Movie(this, "video1.mp4");
  video2 = new Movie(this, "video2nosound.mp4");
  newsletter = loadImage("newsletter.jpg");
  image2 = loadImage("newsletter.jpg");

  video.loop();
  video.play();
  video2.loop();
  video2.play();
  video2.volume(0);
  c = width/2;
  d = height/2;
}
public void draw() {

  if(frameCount % 30 ==0 ){
    if(mouseX>700){
      video2.volume(5);
    }
    if(mouseX<200){    
      video2.volume(0);
    }
    
  }

  image(video, 0, 0,c,d);
  image(video2, width/2, height/2,c,d);
  image(newsletter, width/2,0, c,d);
  image(image2, 0, height/2,c,d);
}

public void movieEvent(Movie m) {
  m.read();
}

public void mousePressed(){
  println(mouseX,mouseY);
}


  public void settings() { fullScreen(3); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--hide-stop", "Monitor" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
