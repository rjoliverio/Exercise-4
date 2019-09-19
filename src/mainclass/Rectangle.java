/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainclass;

/**
 *
 * @author oliverioro_cis21035
 */
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){}
    public Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    public float getLength()
    {
        return length;
    }
    public void setLength(float length)
    {
        this.length=length;
    }
    public float getWidth()
    {
        return width;
    }
    public void setWidth(float width)
    {
        this.width=width;
    }
    public double getArea()
    {
        return (double)(length*width);
    }
    public double getPerimeter()
    {
        return (double)(2*(length+width));
    }
    @Override
    public String toString()
    {
        return "Rectangle[length="+length+",width="+width+"]\n";
    }
}
