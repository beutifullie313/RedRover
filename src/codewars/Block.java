package codewars;

public class Block {

    private int width;
    private int length;
    private int height;




    public Block(int[] blockValues) {
        this.width = blockValues[0];
        this.height = blockValues[1];
        this.length = blockValues[2];


    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        int side1 = width * height;
        int side2 = height * length;
        int side3 = width * length;
        int surfaceArea = 2*(side1+side2+side3);

        return surfaceArea;
    }

}
