
package acer;
class Acer 
{
    String model;
    String colour;
    boolean rgbKeyboard;
    String processor;
    double price;

    Acer(String model, String colour, boolean rgbKeyboard, String processor, double price) {
        this.model = model;
        this.colour = colour;
        this.rgbKeyboard = rgbKeyboard;
        this.processor = processor;
        this.price = price;
    }

    void display() 
    {
        System.out.println("Model      : " + model);
        System.out.println("Colour     : " + colour);
        System.out.println("RGB Keyboard : " + rgbKeyboard);
        System.out.println("Processor  : " + processor);
        System.out.println("Price      : " + price);
    }
}

