
public class RoundRectangleShape implements IDrawable, IShape{

	private static int shpaeIdCounter = 0;
	
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	private float arcWidth;
	private float arcHeidht;
	
	public RoundRectangleShape() {
		
	}
	
	@Override
	public void draw() {
		System.out.println("draw RoundRectangleShape");
	}

	public static int getShpaeIdCounter() {
		return shpaeIdCounter;
	}

	public static void setShpaeIdCounter(int shpaeIdCounter) {
		RoundRectangleShape.shpaeIdCounter = shpaeIdCounter;
	}
	
	public static int getShapeIdCloounter() {
		return shpaeIdCounter++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public float getArcWidth() {
		return arcWidth;
	}

	public void setArcWidth(float arcWidth) {
		this.arcWidth = arcWidth;
	}

	public float getArcHeidht() {
		return arcHeidht;
	}

	public void setArcHeidht(float arcHeidht) {
		this.arcHeidht = arcHeidht;
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
}
