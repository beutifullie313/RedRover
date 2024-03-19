package codewars;

public class Main_cube {

    public static void main(String[] args) {

//        Cube cube = new Cube(4, "");
//        System.out.println(cube.getSide());
//        cube.setSide(7);
//        System.out.println(cube.getSide());
//
//        cube.setName("myCubic");
//
//
//
//        Cube cube2 = new Cube(3,"skdjh");
//        System.out.println(cube2.getName());
//        System.out.println(cube.getName());
//        cube.setLastName("Petrova");
//
//        System.out.println(cube);
//        System.out.println(cube2);

        Block block = new Block(new int[]{2,4});
        System.out.println(block.getWidth());

//        block.getVolume(2,5,9);
        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());


    }
}

