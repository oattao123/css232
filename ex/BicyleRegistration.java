package ex;
class BicyleRegistration {
    public static void main(String[] args) {
        Bicycle bike1,bike2;
        String owner1,owner2;
        String tagno1,tagno2;
        bike1 = new Bicycle();
        bike1.setTagNo("123");
        bike1.setOwnerName("Mike");

        bike2 = new Bicycle();
        bike2.setTagNo("456");
        bike2.setOwnerName("John");
        
        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();
        tagno1 = bike1.getTagNo();
        tagno2 = bike2.getTagNo();

        System.out.println("Bike 1 owner: " + owner1 + " Tag No: " + tagno1) ;
        System.out.println("Bike 2 owner: " + owner2 + " Tag No: " + tagno2);
    }
}