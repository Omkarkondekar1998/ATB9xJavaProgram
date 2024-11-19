package Nov.ex_14112024;

public class Lab169  {

    // Enum to represent different colors
    public enum Color {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255),
        YELLOW(255, 255, 0),
        ORANGE(255, 165, 0),
        PURPLE(128, 0, 128);

        private final int red;
        private final int green;
        private final int blue;

        // Constructor to initialize RGB values for each color
        Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        // Method to get the RGB value as a string
        public String getRGB() {
            return "RGB(" + red + ", " + green + ", " + blue + ")";
        }

        // Method to print the color and its RGB value
        public void printColorInfo() {
            System.out.println(this.name() + ": " + getRGB());
        }
    }

    public static void main(String[] args) {
        // Printing color information for each color
        System.out.println("Color Information:");
        for (Color color : Color.values()) {
            color.printColorInfo();
        }

        // Example of getting a specific color and its RGB value
        Color selectedColor = Color.RED;
        System.out.println("\nSelected color: " + selectedColor + " with RGB: " + selectedColor.getRGB());
    }
}


