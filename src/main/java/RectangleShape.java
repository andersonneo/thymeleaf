
public class RectangleShape  implements IShape, IDrawable{
	
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	
	public RectangleShape() {
	}

	public RectangleShape(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		
		this.width=width;
		this.height=height;
	}
	
	public void draw() {
		System.out.println("draw ReactangleShape");
	}
	
	public void draw(float arcWidth, float arcHeight) {
		System.out.println("draw RoundReactangleShape");
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

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
