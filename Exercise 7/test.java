//Ocean Lu
//Zander Ilagen
//CS 141
//Exercise 7
//11.08.17

public class test {

    public static void main(String[] args) {
        Rose rose = new Rose(16);
        Foxgloves foxglove = new Foxgloves(true);
        Flower daisy = new Flower();
        rose.setNames("Mary");
        rose.setLeaves(4);
        rose.setPetals(12);

        daisy.setNames("Daisy");
        daisy.setLeaves(15);
        daisy.setPetals(13);

        foxglove.setLeaves(11);
        foxglove.setName("Foxy");
        foxglove.setPetals(30);

        System.out.println("Name: " + daisy.getName() + "\nLeaves: " + daisy.getLeaves() + "\nPetals: " + daisy.getPetals());
        System.out.println("\nName: " + rose.getName() + "\nThorns: " + rose.getThorns() + "\nLeaves: " + rose.getLeaves() + "\nPetals: " + rose.getPetals());
        System.out.println("\nName: " + foxglove.getName() + "\nPoison: " + foxglove.getPoison() + "\nLeaves: " + foxglove.getLeaves() + "\nPetals: " + foxglove.getPetals());
    }
}

