// code here

import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

Font font = new Font("Arial",  30);

return TextExtrude.text((double)10.0,"Hello World 1234!",font).collect{
	it.rotx(180)
	.toZMin()

}
double width = 30
double depth= 70
double height =3

print "width is"+width
print "height is"+height 
print " depth is"+depth

CSG nameTagBase = new Cube(width,depth,height).toCSG()

return nameTagBase

