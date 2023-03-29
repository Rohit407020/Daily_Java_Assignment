package com.multiple;

 class Shapemulti {
    private String shapeName,shapeType;

	public Shapemulti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shapemulti(String shapeName, String shapeType) {
		super();
		this.shapeName = shapeName;
		this.shapeType = shapeType;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	public String getShapeType() {
		return shapeType;
	}

	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	@Override
	public String toString() {
		return "Shape [shapeName=" + shapeName + ", shapeType=" + shapeType + "]";
	}
	
    
}
  class Rectangle extends Shapemulti{
		private int length,breadth;
	}


public class Shape {
	public static void main(String args[]){
		
		}
	}
