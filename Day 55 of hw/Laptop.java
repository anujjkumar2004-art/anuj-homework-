
package laptopsystem;

class Laptop 
{   
    private String brand;
    private String ram;
    private boolean ssd;
    private boolean graphicsCard;
    private boolean extendedWarranty;
    private boolean msOffice;

    
    private Laptop(LaptopBuilder builder) 
    {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
        this.graphicsCard = builder.graphicsCard;
        this.extendedWarranty = builder.extendedWarranty;
        this.msOffice = builder.msOffice;
    }

    
    public void display() {
        System.out.println("\n------ Laptop Order Details ------");
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram);
        System.out.println("SSD: " + ssd);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Extended Warranty: " + extendedWarranty);
        System.out.println("MS Office: " + msOffice);
    }

    
    public static class LaptopBuilder 
    {

        private String brand;
        private String ram;
        private boolean ssd = false;
        private boolean graphicsCard = false;
        private boolean extendedWarranty = false;
        private boolean msOffice = false;

        public LaptopBuilder(String brand, String ram) {
            this.brand = brand;
            this.ram = ram;
        }

       
        public LaptopBuilder setSSD(boolean ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public LaptopBuilder setExtendedWarranty(boolean extendedWarranty) {
            this.extendedWarranty = extendedWarranty;
            return this;
        }

        public LaptopBuilder setMSOffice(boolean msOffice) {
            this.msOffice = msOffice;
            return this;
        }

        
        public Laptop build() {
            return new Laptop(this);
        }
    }
}

